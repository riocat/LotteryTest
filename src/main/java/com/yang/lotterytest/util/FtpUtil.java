package com.yang.lotterytest.util;

import org.apache.commons.net.ftp.FTPClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by ASUS on 2017/6/1.
 */
public class FtpUtil {


    private static final String userName = "fileftp";
    private static final String password = "intelf";
    private static final String url = "192.168.1.100";
    private static final String basePath = "temp";
    private static final int port = 21;


    public static synchronized boolean checkDirIsExist(FTPClient client, String s) throws Exception {
        client.changeWorkingDirectory(basePath);
        try {
            if (!client.changeWorkingDirectory(s)) {
                client.makeDirectory(s);
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    //    注意路径问题
    public static boolean uploadFile(String originName, String targetName, InputStream fis, String path) {
        FTPClient client = new FTPClient();
        try {
            client.connect(url, port);
            client.login(userName, password);
//            client.enterLocalPassiveMode();
            if (checkDirIsExist(client, path)) {
                client.changeWorkingDirectory(path);
                client.setBufferSize(1024);
                return client.storeFile(targetName, fis);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                client.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    public static void downloadFile(String filePath, OutputStream fos) {
        FTPClient client = new FTPClient();
        try {
            client.connect(url, port);
            client.login(userName, password);
            client.changeWorkingDirectory(basePath);
            String[] path = filePath.split("/");
            if (path.length > 1) {
                for (int i = 0; i < path.length - 1; i++) {
                    client.changeWorkingDirectory(path[i]);
                }
            }
            System.out.println(client.printWorkingDirectory());
            client.retrieveFile(path[path.length - 1], fos);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                client.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.flush();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //
    // changeWorkingDirectory直接使用"temp/20170601"这样的参数应该也可以不过2017/6/1多次测试失败使用以下多次跳转的方式
    // 登陆后在用户文件夹下使用changeWorkingDirectory一级一级跳转可以解决无法跳转创建文件夹会发生550命令未执行的问题
    public static synchronized boolean createDir(String s) throws Exception {
        FTPClient client = new FTPClient();
        try {
            client.connect(url, port);
            client.login(userName, password);
            client.changeWorkingDirectory(basePath);
            if (!client.changeWorkingDirectory(s)) {
                return client.makeDirectory(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                client.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
