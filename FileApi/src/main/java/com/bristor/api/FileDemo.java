package com.bristor.api;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.List;

import com.bristor.utils.FileUtils;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		//1.file类构造方法获取流
		File file = new File("D:\\test");//如果不存在，下面判断为false
		System.out.println(file.getAbsolutePath());//该文件绝对路径D:\test
		System.out.println(file.getParent());//该文件父文件夹D:\
		System.out.println(file.isDirectory());//是不是文件夹false
		System.out.println(file.exists());//该文件是否存在false
		System.out.println(file.length());//该文件长度（大小）,如果是文件才可以，目录是0

		//2.创建文件夹与创建文件
		File bb = new File("D:\\test\\aa\\bb");
		bb.mkdir();//创建一个非嵌套文件夹,已存在则返回false
		bb.mkdirs();//创建任意多文件夹,中间的路径一并建立
		File cc = new File("D:\\test\\aa\\qq.txt");
		cc.createNewFile();//创建文件,//如果路径不存在会抛异常

		//3.遍历文件夹（只是当前文件夹，子文件夹中的需要递归遍历）
		//3.1 file.list()返回String数组，只是名称遍历
		String[] names = file.list();//该文件夹中所有文件夹和文件的名字
		for (String string : names) {
			System.out.println("当前目录所有的文件和文件夹："+string);
		}
		//3.2 file.list(FilenameFilter filter)文件名过滤
		String[] names2 = file.list(new FilenameFilter() {//FilenameFilter：文件名过滤器
			//第一个参数：要遍历的文件夹；第二个参数：要遍历的文件夹当中的每个文件名
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".java");//后缀名
			}
		});
		for (String string : names2) {
			System.out.println(string);
		}
		//3.3 file.listFiles()该文件夹中所有文件夹和文件返回file数组，是文件遍历
		File[] files = file.listFiles();//该文件夹中所有文件夹和文件
		for (File son : files) {
			System.out.println("file.listFiles():"+son.getAbsolutePath());
		}
		//3.4 File.listFiles(FileFilter filter)过滤文件
		File[] files2 = file.listFiles(new FileFilter() {//FileFilter：文件过滤器
			//pathname参数：遍历到的每个文件夹或文件
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.getName().endsWith(".class");
			}
		});
		for (File son : files2) {
			System.out.println(son.getName());
		}
		//4.递归遍历
		List<String> loopFile = FileUtils.loopFile(file);
		System.out.println(loopFile.toString());
		//5.删除文件夹与删除文件
		System.out.println("删除文件夹:"+bb.delete());//删除文件或者删除空的文件夹；如果存在文件的文件夹无法删除


		//6.递归删除


	}
}
















