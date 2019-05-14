package util;


import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;

public class SmsTest {

	public static void main(String[] args) throws Exception {
		String randomCode = "8888";
		SendSmsResponse response = ALDYSmsUtil.sendSms(ConstantType.myTelephone, "SMS_134328095", "上进青年",
				"{\"code\":"+randomCode+"}");
		System.out.println(response.getCode());
	}
}
