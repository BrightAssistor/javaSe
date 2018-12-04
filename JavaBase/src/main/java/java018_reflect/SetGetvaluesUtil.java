package java018_reflect;

import java.lang.reflect.Field;


public class SetGetvaluesUtil {

	/**
	 * 
	 * @param obj1
	 *            后台对象demo
	 */
	public static void getCode(Object obj1, Object obj2) {
		// 后台对象
		Class<?> demoClz = obj1.getClass();
		Class<?> resClz = obj2.getClass();

		Field[] fields = demoClz.getDeclaredFields();
		Field[] resFields = resClz.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {

			String upperName = fields[i].getName().substring(0, 1)
					.toUpperCase()
					+ fields[i].getName().substring(1);
			System.out.println("\tif (!StringUtils.isEmpty(demo.get"
					+ upperName + "())) {");

			String resUpperName = resFields[i].getName().substring(0, 1)
					.toUpperCase()
					+ resFields[i].getName().substring(1);
			System.out.println("\t\tresponse.set" + resUpperName
					+ "(demo.get" + upperName + "());");
			
			System.out.println("\t}");
		}
	}

	// if (!StringUtils.isEmpty(demo.getDkjiejuh())) {
	// response.setLoanBillNum(demo.getDkjiejuh());
	// }
	//
	// if (!StringUtils.isEmpty(demo.getNormlPrincl())) {
	// response.setNormPrincl(new BigDecimal(demo.getNormlPrincl()));
	// }

	public static void main(String[] args) {
//		RepaymentResponse request = new RepaymentResponse();
//		PaymentBatchPretreatmentResponse paymentBatchPretreatmentRequest = new PaymentBatchPretreatmentResponse();
//
//		getCode(paymentBatchPretreatmentRequest, request);

	}
	
}
