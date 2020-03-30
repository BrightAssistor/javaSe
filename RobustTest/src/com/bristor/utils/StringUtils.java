package com.bristor.utils;

public class StringUtils {
	public static boolean isEmpty(String source) {
		if (source == null || source.trim() =="" && source.length()<=0) {
			return true;
		}
		return false;

	}
	public static String replaceWord(String source,String word,String newWord) {
		if (isEmpty(source)) {
			return null;
		}
		String[] split = source.split(word);
		return split[0]+newWord+split[1];
	}
	public static String[] splitByCNorEN(String source) {
		if (isEmpty(source)) {
			return null;
		}
		if (source.indexOf(CommonConfigs.SPLITCOMMA) >0) {
			return source.trim().split(CommonConfigs.SPLITCOMMA);
		}else if (source.indexOf(CommonConfigs.SPLITCOMMA_CN) >0) {
			return source.trim().split(CommonConfigs.SPLITCOMMA_CN);
		}else {
			return new String[]{source};
		}
	}
	public static String insteadValue(String source,String key,String dataType,String value) {
		String result = null;
		if (CommonConfigs.XML.equals(dataType)) {
			String key1= "<"+key+">";
			String key2= "</"+key+">";
			if (source.indexOf(key1)<=0) {
				return null;
			}
			int index1= source.indexOf(key1)+key1.length();
			int index2= source.indexOf(key2);
			result = source.substring(0,index1)+value+source.substring(index2);
		}else if (CommonConfigs.JSON.equals(dataType)) {
			String key1= "\""+key+"\"";
			String value1= "\""+value+"\"";
			if (source.indexOf(key1)<=0) {
				return null;
			}
			int index0= source.indexOf(key1);
			int index1= source.indexOf(":",index0);
			int index2= source.indexOf(",",index0);
			if (index2<0) {
				index2 = source.indexOf("}"+index0);
			}
			result = source.substring(0,index1+1)+value+source.substring(index2);
		}else if (CommonConfigs.CD.equals(dataType)) {
			String key1= "<data name=\""+key+"\">";
			String key2= "</field>";
			if (source.indexOf(key1)<=0) {
				return null;
			}
			int index0= source.indexOf(key1)+key1.length();
			int index1= source.indexOf(">",index0);
			if ('/'==(source.charAt(index1-1))) {
				return null;
			}
			int index2= source.indexOf(key2,index0);
			result = source.substring(0,index1+1)+value+source.substring(index2);
		}else {
			return null;
		}
		return result;

	}
}
