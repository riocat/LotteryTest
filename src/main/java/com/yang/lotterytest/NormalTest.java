package com.yang.lotterytest;

/**
 * Created by rio on 2018/11/9.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.output.StringBuilderWriter;
import org.apache.commons.lang.StringUtils;

public class NormalTest {

    public static void main(String[] args) throws IOException {
        // Sclass s = new Sclass();
        // Fclass f = s;
        // System.out.println(s.name);
        // System.out.println(f.name);

		/*
         * BigDecimal b = new BigDecimal(""); System.out.println(new
		 * BigDecimal(b.toString()));
		 */

        // Map<String,Object> map = new HashMap<String,Object>();
        // map.put("test", true);
        // if((boolean) map.get("test")){
        // System.out.println("true");
        // }

		/*
         * List<String> list = new ArrayList<>(); list.add("C201709300007");
		 * list.add("CS201710090007");
		 */

        // String str1 = "C201709300007";
        // String str1 = "201709300007";
        /*
         * String str1 = "C"; String pattern = "(\\D*)(\\d+)"; Pattern r =
		 * Pattern.compile(pattern); Matcher m = r.matcher(str1); if (m.find())
		 * { String result = m.group(2); System.out.println(result); }
		 */

		/*
         * try { throw new Exception(); } catch (Exception e) { StringWriter sw
		 * = null; PrintWriter pw = null; try { // 记录失败信息 sw = new
		 * StringWriter(); pw = new PrintWriter(sw, true);
		 * e.printStackTrace(pw); String stacktrac = sw.getBuffer().toString();
		 * System.out.println(stacktrac); } catch (Exception e1) {
		 * e1.printStackTrace(); } finally { pw.close(); sw.close(); } }
		 */

		/*
         * String a = ""; String[] as = a.split(",");
		 *
		 * for (String s : as) { System.out.println(1); }
		 */

		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); Date date
		 * = null; try { date = sdf.parse("2011-11-11"); } catch (ParseException
		 * e) {
		 *
		 * e.printStackTrace(); }
		 *
		 * // System.out.println(date);
		 *
		 * Calendar cal = new GregorianCalendar(); cal.setTime(new Date());
		 * cal.add(Calendar.MONTH, 3); Date date = cal.getTime();
		 * System.out.println(sdf.format(date));
		 */

		/*
		 * String outTradeNo = "G" + System.currentTimeMillis() + (long)
		 * (Math.random() * 10000000L);
		 *
		 * System.out.println(outTradeNo);
		 */

		/*
		 * BigDecimal bi = new BigDecimal(12.345); bi = bi.setScale(2,
		 * BigDecimal.ROUND_HALF_UP); System.out.println(bi.toString());
		 *
		 * bi.longValue();
		 */

		/*
		 * Map map = new HashMap<>();
		 *
		 * System.out.println("4".equals(map.get("SourceCode")));
		 */

		/*
		 * HashMap map = new HashMap<String,Object>();
		 *
		 * map.put("a", null);
		 *
		 * StringBuilder str = new StringBuilder();
		 *
		 * str.append(map.get("a"));
		 *
		 * System.out.println(str.toString());
		 */

		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MMdd日 HH时");
		 *
		 * System.out.println(sdf.format(new Date()));
		 */

		/*
		 * List<String> str = new ArrayList<String>(); str.get(0);
		 */

        // System.out.println(testClassAdd());

		/*
		 * for (int i = 0; i < 10; i++) { int j = ++i; System.out.println(j); }
		 *
		 * for (int i = 0; i < 10; i++) { int j = ++i; System.out.println(j); }
		 */

		/*
		 * BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); System.out.println("输入字符, 按下 'q' 键退出。"
		 * ); char c;
		 *
		 * do { c = (char) br.read(); System.out.println(c); } while (c!='q');
		 */

		/*
		 * int[] te = { 1, 45 };
		 *
		 * try { System.out.println(te[5]); } catch
		 * (ArrayIndexOutOfBoundsException e) { // TODO Auto-generated catch
		 * block System.out.println(1); } catch (Exception e) { // TODO
		 * Auto-generated catch block System.out.println(2); }
		 */

		/*
		 * Integer year = 2019;
		 *
		 * byte byear = (byte) 0x07d9;
		 *
		 * System.out.println(byear);
		 */

		/*
		 * System.out.println(testReverse("000000064613968668"));
		 *
		 * System.out.println(testReverse("64613968668"));
		 *
		 * System.out.println(testReverse("613968668"));
		 */

		/*
		 * String carName = "津C5"; System.out.println(carName);
		 * System.out.println(Arrays.toString(carName.getBytes()));
		 * System.out.println(getByteStr(carName.getBytes())); String newStr =
		 * new String(carName.getBytes(), "GB2312"); System.out.println(newStr);
		 * System.out.println(Arrays.toString(newStr.getBytes()));
		 * System.out.println(getByteStr(newStr.getBytes()));
		 */

/*//    double[] tempLocation =new double[]{-1000.0,-1000.0};

        double[] tempLocation = null;

        if (tempLocation == null)
        {
            System.out.println(666666666);
        }*/

        /*intTest(0);

        // double lld = Double.valueOf("2f");
        // System.out.println(lld);

        // 无符号Long类型获取真值
        byte[] longA = new byte[8];
        longA[0] = (byte) 0xFF;
        for (int i = 1; i < 8; i++) {
            longA[i] = (byte) 0xFF;
//			System.out.println(longA[i]);
        }

        BigDecimal targetValue = getUnsignedLong(longA);

//        System.out.println(targetValue.toString());

        System.out.println(getBinaryString(targetValue, new StringBuilder()));
        System.out.println(getBinaryString(targetValue.add(new BigDecimal(7381377326613183173L)), new StringBuilder()));

        System.out.println(getBinaryString(new BigDecimal(13), new StringBuilder()));
        System.out.println(getBinaryString(new BigDecimal(0), new StringBuilder()));
        System.out.println(getBinaryString(new BigDecimal(1), new StringBuilder()));
        System.out.println(getBinaryString(new BigDecimal(2), new StringBuilder()));
        System.out.println(getBinaryString(new BigDecimal(8), new StringBuilder()));
        System.out.println(getBinaryString(new BigDecimal(37), new StringBuilder()));

        Byte a = (byte)0xff;

        System.out.println(a);*/


/*        System.out.println(getBinaryString("A"));

        char c = '$';
        System.out.println(Integer.toBinaryString(c & 0xff));

        String[] sar = "20180508150147700".split(",");
        System.out.println(Arrays.toString(sar));*/

        String hexStr = "0x540x680x000x000x130x140x070x410x620x000x020x110x180x180x100x220x030x420x160x250x720x910x100x010x320x560x100x460x460x510x000x000x000x000x000x000x000x000x0d0x0a";
        System.out.println(hexStr);
        getHexStrFromByteArray(getByteArrayFromHexStr(hexStr));

    }

    public static String getByteStr(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        int temp = 0;
        for (byte b : bytes) {
            System.out.println("b:" + b);
            temp = b & 0xff;
            System.out.println("toBinaryString:" + Integer.toBinaryString(temp));
            System.out.println("HexString:" + Integer.toHexString(temp));
            System.out.println("OctalString:" + Integer.toOctalString(temp));
            System.out.println("UnsignedLong:" + Integer.toUnsignedLong(temp));
            sb.append(Integer.toBinaryString(temp));
        }
        return sb.toString();
    }

    public static void returnTest() {
        double[] target = {-1000.0, -1000.0};
        if (target[0] == -1000.0)
            System.out.println("true");
        return;
    }

    public static String testReverse(String src) {
        System.out.println(src);
        if (src.length() > 11) {
            src = src.substring(src.length() - 11, src.length());
        } else {
            StringBuffer target = new StringBuffer();
            int addNum = 11 - src.length();
            for (int i = 0; i < addNum; i++) {
                target.append(0);
            }
            target.append(src);
            src = target.toString();
        }

        System.out.println(src);
        src = src.substring(src.length() - 11, src.length());

        return src;
    }

    public static void intTest(int a) {
        System.out.println(a);
    }

    public static BigDecimal getUnsignedLong(byte[] longA) {
        byte highestBits = longA[0];
        long temp = (highestBits & 0xFFL) << 48;
//		System.out.println(Long.toBinaryString(temp));
        BigDecimal bigVlaue = BigDecimal.valueOf(temp).multiply(new BigDecimal(2).pow(8));
        long v1 = (longA[1] & 0xFFL) << 48;
        long v2 = (longA[2] & 0xFFL) << 40;
        long v3 = (longA[3] & 0xFFL) << 32;
        long v4 = (longA[4] & 0xFFL) << 24;
        long v5 = (longA[5] & 0xFFL) << 16;
        long v6 = (longA[6] & 0xFFL) << 8;
        long v7 = (longA[7] & 0xFFL);

        long endLong = v1 + v2 + v3 + v4 + v5 + v6 + v7;

        long smallValue = ((longA[1] & 0xFFL) << 48) + ((longA[2] & 0xFFL) << 40) + ((longA[3] & 0xFFL) << 32)
                + ((longA[4] & 0xFFL) << 24) + ((longA[5] & 0xFFL) << 16) + ((longA[6] & 0xFFL) << 8) + ((longA[7] & 0xFFL) << 0);

        // 相加超出int范围 变为 0 ???
        long addtest = (longA[3] & 0xFFL) << 32 + (longA[4] & 0xFFL) << 24 + (longA[5] & 0xFFL) << 16 + (longA[6] & 0xFFL) << 8 + (longA[7] & 0xFFL) << 0;

//        System.out.println(Long.toBinaryString(endLong));
//        System.out.println(endLong);

        BigDecimal targetValue = bigVlaue.add(new BigDecimal(smallValue));

//        System.out.println(targetValue.toEngineeringString());
//        System.out.println(targetValue.toPlainString());

        return targetValue;
    }

    /**
     * 计算任意大无符号正整数的二进制原码
     *
     * @param targetValue
     * @param stringBuilder
     * @return
     */
    public static StringBuilder getBinaryString(BigDecimal targetValue, StringBuilder stringBuilder) {
        BigDecimal[] results = targetValue.divideAndRemainder(new BigDecimal(2));
        if (results[0].compareTo(new BigDecimal(1)) >= 0) {
            getBinaryString(results[0], stringBuilder);
            stringBuilder.append(results[1]);
        } else {
            stringBuilder.append(results[1]);
        }

        return stringBuilder;
    }

    public static String getBinaryString(String target) {
        if (target != null) {
            byte[] b = target.getBytes();
            StringBuilder sb = new StringBuilder();
            for (byte by : b) {
                sb.append(Integer.toBinaryString(by));
            }
            return sb.toString();
        }
        return null;
    }

    public static String getHexStrFromByteArray(byte[] ba) {
        StringBuilder sb = new StringBuilder();
        for (byte b : ba) {
            sb.append("0x");
            String temp = Integer.toHexString(b & 0xFF);
            if (temp.length() < 2) {
                sb.append("0");
            }
            sb.append(temp);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static byte[] getByteArrayFromHexStr(String hexStr) {
        StringBuilder tempSB = new StringBuilder();
        char[] ca = hexStr.toUpperCase().toCharArray();
        byte[] target = new byte[hexStr.length() / 4];
        String utilStr = "0123456789ABCDEF";
        for (int i = 0; i < ca.length; ) {
            byte tb = (byte) ((utilStr.indexOf(ca[i + 2]) << 4) | utilStr.indexOf(ca[i + 3]));
            target[i / 4] = tb;
            tempSB.append(tb);
            i = i + 4;
        }
//        System.out.println(tempSB.toString());
        return target;
    }
}
