package java025_Json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * json自定义工具类
 * @ClassName:JsonUtil
 * @Description:TODO
 * @Author:maxz
 * @Date:2016年9月25日 下午1:31:45
 */
public class JsonUtil {

	/**
	 * jsonToObject
	 * @param jsonStr
	 * @param T
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T jsonStrToObject(String jsonStr, Class<?> T){
		try {
			return (T)JSON.parseObject(jsonStr, T);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * objectToJsonStr
	 * @param object
	 * @return
	 */
	public static String objectToJsonStr(Object object){
		try {
			return JSONObject.toJSONString(object);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}


