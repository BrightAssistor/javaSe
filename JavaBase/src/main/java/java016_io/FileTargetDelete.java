package java016_io;

import java.io.File;
import java.io.IOException;
/**
 * 循环删除target目录下所有文件及文件夹
 * @author mr.qiu
 *
 */
public class FileTargetDelete {

    public static void main(String[] args) {  
        String filePath = "D:\\Work\\Gmacsaic\\copyCode\\workspace_gmac_2018062501";
        String targetDirectory = "target";
        System.out.println("删除目录及子文件结果开始。。。");
		boolean deleteDirectory = deleteDirectory(filePath, targetDirectory);
		System.out.println("删除目录及子文件结束，结果：" + deleteDirectory);
       
    }  
  
    private static boolean deleteDirectory(String filePath, String targetDirectory) {
    	File file = new File(filePath);
		if (!file.isDirectory()) {
			return false;
		}
		//递归扫描并删除
        scan(file,targetDirectory);  
		return true;
	}

	/** 
     * 递归扫描并删除 
     */  
    private static void scan(File f, String targetDirectory) {  
        if (f.isDirectory()) {  
            if (f.getName().equals(targetDirectory)) {  
                System.out.println(f.getName());  
                try {
					deleteDir(f);
			        createfile(f.getAbsolutePath());
			        System.out.println("已刪除："+f.getAbsolutePath());
				} catch (IOException e) {
					e.printStackTrace();
				}  
            }  
            File[] fileArray = f.listFiles();  
            if (fileArray != null) {  
                for (int i = 0; i < fileArray.length; i++) {  
                    scan(fileArray[i],targetDirectory);  
                }  
            }  
        } else {  
            // 单个文件  
        }  
    }  
    /** 
     * 递归删除目录下的所有文件及子目录下所有文件
     */  
    private static boolean deleteDir(File dir) throws IOException {  

        if (dir.isDirectory()) {  
            String[] children = dir.list();//递归删除目录中的子目录下  
            for (int i=0; i<children.length; i++) {  
                boolean success = deleteDir(new File(dir, children[i]));  
                if (!success) {  
                    return false;  
                }  
            }  
        }  
        // 目录此时为空，可以删除 
        return dir.delete();  
    }

	private static void createfile(String filePath) {
		  File f = new File(filePath);
	      f.mkdirs();	
	}  

}
