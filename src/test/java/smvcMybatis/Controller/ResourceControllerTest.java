package smvcMybatis.Controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import org.junit.Before;
import org.junit.Test;

public class ResourceControllerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCheckImg() {
		/*FileOutputStream fio;
		try {
			fio = new FileOutputStream("/NW/smvcMybatisSqlSessionTemplate/src/main/webapp/img/test.png");
			Random ran = new Random();
			int checkKey = ran.nextInt(9000) + 1000;
			BufferedImage bfi = new BufferedImage(150, 34, BufferedImage.TYPE_INT_RGB);
			Graphics gra = bfi.getGraphics();
			int Rint = ran.nextInt(256);
			int Gint = ran.nextInt(256);
			int Bint = ran.nextInt(256);
			gra.setColor(new Color(Rint, Gint, Bint));
			gra.fillRect(0, 0, 150, 34);
			gra.setColor(new Color(Math.abs(255 - Rint), Math.abs(255 - Gint), Math.abs(255 - Bint)));
			gra.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
			gra.drawString(new Integer(checkKey).toString(), 150 / 3, 34 * 2 / 3);
			ImageIO.write(bfi, "PNG", fio);
			fio.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
