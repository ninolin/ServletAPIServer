package nino.API.Data;

public class ResponseCode {
	public final static int unknown_error = 0; //未知的錯誤
	public final static int success = 1;	   //成功
	public final static int token_failed = 2;  //token驗證失敗
	public final static int invalid_login_info = 1000; //錯誤的登入資訊
	public final static int account_already_exists = 1001; //帳號已存在
	public final static int access_denied = 1005; //權限不足
	public final static int parameter_error = 2000; //參數錯誤
	public final static int uri_not_found = 2001; //URI不存在
}
