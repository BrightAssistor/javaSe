package java017_internet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

//URL应用
public class URLDemo {
	public static void main(String[] args) {
		DownloadUtil
				.download(
						"http://b.hiphotos.baidu.com/news/q%3D100/sign=950401443afa828bd72399e3cd1e41cd/aa18972bd40735facff7cbf897510fb30f24086f.jpg",
						"url.jpg", "d:\\url");
	}
}

// 下载工具类
class DownloadUtil {
	// 参数1：网络资源的路径，参数2：保存文件的名称，参数3：保存到的路径
	public static void download(String urlString, String filename,
			String savePath) {
		URL url;
		InputStream iStream = null;
		FileOutputStream fos = null;
		try {
			// 1:创建url
			url = new URL(urlString);
			// 2.打开链接
			// URLConnection conn = url.openConnection();
			// // 设置请求超时：5s
			// conn.setConnectTimeout(5 * 1000);
			// // io流读取图片
			// iStream = conn.getInputStream();

			iStream = url.openStream();

			File file = new File(savePath);// 映射磁盘文件夹
			if (!file.exists()) {
				file.mkdirs();// 创建文件夹
			}
			// 写入指定位置的文件
			fos = new FileOutputStream(file.getPath() + "\\" + filename);
			// 缓存区
			byte[] bs = new byte[1024];
			int len = 0;
			while ((len = iStream.read(bs)) != -1) {
				fos.write(bs, 0, len);
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 释放资源
			try {
				iStream.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
