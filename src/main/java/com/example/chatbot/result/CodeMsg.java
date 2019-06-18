package com.example.chatbot.result;

public class CodeMsg {
/**
 * @author ZFC
 * @create 2018-07-25 20:40
 * @desc
 **/
    private int code;
    private String msg;


    //通用的错误码
    public static CodeMsg SUCCESS = new CodeMsg(0, "success"    );
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "服务端异常");
    public static CodeMsg BIND_ERROR = new CodeMsg(500101, "参数校验异常");
    public static CodeMsg TABLE_NULL = new CodeMsg(500102, "表中暂无数据");
    public static CodeMsg SELECT_NULL = new CodeMsg(500103, "该查询返回为空");
    public static CodeMsg UPDATE_FAILED = new CodeMsg(500104, "更新失败");
    public static CodeMsg NULL_POINT_EXCEPTION = new CodeMsg(500105, "空指针异常");
    public static CodeMsg NULL_PARAM = new CodeMsg(500106, "空插入");
    public static CodeMsg INSERT_ERROR = new CodeMsg(500107, "插入异常");
    public static CodeMsg RECORD_REPEAD = new CodeMsg(500108, "插入重复");
    public static CodeMsg NULL_PARAM_INPUT = new CodeMsg(500109, "空参数");


    //登录模块 5002XX
    public static CodeMsg SESSION_ERROR = new CodeMsg(500210, "Session不存在或者已经失效");
    public static CodeMsg PASSWORD_EMPTY = new CodeMsg(500211, "登录密码不能为空");
    public static CodeMsg MOBILE_EMPTY = new CodeMsg(500212, "手机号不能为空");
    public static CodeMsg MOBILE_ERROR = new CodeMsg(500213, "手机号格式错误");
    public static CodeMsg MOBILE_NOT_EXIST = new CodeMsg(500214, "手机号不存在");
    public static CodeMsg MOBILE_EXIST = new CodeMsg(500215,"手机号已被注册");
    public static CodeMsg PASSWORD_ERROR = new CodeMsg(500216, "密码错误");
    public static CodeMsg UPDATE_ERROR = new CodeMsg(500217, "更新失败");
    public static CodeMsg PHONE_EXIST = new CodeMsg(500218, "用户已存在");
    public static CodeMsg VERIFICATION_CODE_EMPTY = new CodeMsg(500219,"验证码不能为空");
    public static CodeMsg EMAIL_EMPTY = new CodeMsg(500220,"邮箱不能为空");
    public static CodeMsg EMAIL_ERROR = new CodeMsg(500221,"邮箱格式错误");
    public static CodeMsg EMAIL_EXIST = new CodeMsg(500222,"邮箱已被注册");
    public static CodeMsg LOGIN_FAIL = new CodeMsg(500223,"登录失败");
    public static CodeMsg USERNAME_NOT_EXIST = new CodeMsg(500224, "用户名不存在");
    public static CodeMsg USERNAME_SALT_EMPTY = new CodeMsg(500225, "用户名md5不存在");
    public static CodeMsg NAME_EMPTY = new CodeMsg(500226, "姓名为空");
    public static CodeMsg CREDITCARD_EMPTY = new CodeMsg(500227, "银行卡号为空");
    public static CodeMsg IDCARD_EMPTY = new CodeMsg(500228, "身份证号为空");
    public static CodeMsg REGISTER_ERROR = new CodeMsg(500229,"注册失败");
    public static CodeMsg VERIFY_ERROR = new CodeMsg(500230,"邮箱验证失败");
    public static CodeMsg EMAIL_SEND_ERROR = new CodeMsg(500231,"邮箱发送失败");
    public static CodeMsg VERIFICATION_CODE_ERROR = new CodeMsg(500232,"验证码输出错误");
    public static CodeMsg EMAIL_NOT_EXIST = new CodeMsg(500233,"邮箱不存在");
    public static CodeMsg REDIS_SET_ERROR = new CodeMsg(500234,"redis设置失败");
    public static CodeMsg USER_NOT_LOGIN = new CodeMsg(500235,"用户未登录");
    public static CodeMsg USER_NOT_EXIST = new CodeMsg(500236,"用户不存在");
    public static CodeMsg USER_BE_LOCKED = new CodeMsg(500237,"用户未激活或被锁定");
    public static CodeMsg EMAIL_IS_EXIST = new CodeMsg(500238,"邮箱已存在");
    public static CodeMsg REGISTER_FAIL = new CodeMsg(500239,"注册失败，请重试");
    public static CodeMsg USERNAME_EMPTY = new CodeMsg(500240,"用户名为空");
    public static CodeMsg USERNAME_REPEATED = new CodeMsg(500241,"用户名已存在");
    public static CodeMsg PASSWORD_NOT_EUQAL = new CodeMsg(500242,"两次输入密码不一致");
    public static CodeMsg CHNAGE_PERMISSION_DENY = new CodeMsg(500243,"无权修改该用户密码");
    public static CodeMsg NO_LOGIN_RECORD = new CodeMsg(500244,"暂无登录记录");
    public static CodeMsg NO_LOGIN_SRC = new CodeMsg(500245,"没添加用户登录来源");
    public static CodeMsg Sent_Message_Fail = new CodeMsg(500246,"短信验证码发送失败");
    public static CodeMsg Valiate_Code_Fail = new CodeMsg(500247,"短信验证码验证失败");

    //用户修改模块 5006XX
    public static CodeMsg MODIFYNAME_SUCCESS = new CodeMsg(500601 ,"账号修改成功");
    public static CodeMsg MODIFYNAME_ERROR = new CodeMsg(500602 ,"账号修改失败");

    public static CodeMsg MODIFYPASSWORD_SUCCESS = new CodeMsg(500601 ,"密码修改成功");
    public static CodeMsg MODIFYPASSWORD_ERROR = new CodeMsg(500602 ,"密码修改失败");

    public static CodeMsg MODIFYTELEPHONE_SUCCESS = new CodeMsg(500603 ,"电话修改成功");
    public static CodeMsg MODIFYTELEPHONE_ERROR = new CodeMsg(500604 , "电话修改失败");

    public static CodeMsg MODIFYNIKNAME_SUCCESS = new CodeMsg(500605,"昵称修改成功");
    public static CodeMsg MODIFYNIKNAME_ERROR = new CodeMsg(500606,"昵称修改失败");

    public static CodeMsg MODIFYHEAD_SUCCESS = new CodeMsg(500607,"头像修改成功");
    public static CodeMsg MODIFYHEAD_ERROR = new CodeMsg(500608,"头像修改失败");

    public static CodeMsg MODIFYEMAIL_SUCCESS = new CodeMsg(500609,"邮箱修改成功");
    public static CodeMsg MODIFYEMAIL_ERROR = new CodeMsg(500610,"邮箱修改失败");

    public static CodeMsg MODIFYROLE_SUCCESS = new CodeMsg(500611,"角色修改成功");
    public static CodeMsg MODIFYROLE_ERROR = new CodeMsg(500612,"角色修改失败");

    public static CodeMsg MODIFYRANKSCORE_SUCCESS = new CodeMsg(500613,"等级积分修改成功");
    public static CodeMsg MODIFYRANKSCORE_ERROR = new CodeMsg(500614,"等级积分修改失败");

    public static CodeMsg MODIFYPERMISSION_SUCCESS = new CodeMsg(500615,"权限修改成功");
    public static CodeMsg MODIFYPERMISSION_ERROR = new CodeMsg(500616,"权限修改失败");

    public static CodeMsg MODIFYIDENTITY_SUCCESS = new CodeMsg(500617,"身份证修改成功");
    public static CodeMsg MODIFYIDENTITY_ERROR = new CodeMsg(500618,"身份证修改失败");

    public static CodeMsg MODIFYCREDITSCORE_SUCCESS = new CodeMsg(500619,"信用积分修改成功");
    public static CodeMsg MODIFYCREDITSCORE_ERROR = new CodeMsg(500620,"信用积分修改失败");

    public static CodeMsg MODIFYCONSUMPTIONSCORE_SUCCESS = new CodeMsg(500621,"消费积分修改成功");
    public static CodeMsg MODIFYCONSUMPTIONSCORE_ERROR = new CodeMsg(500622,"消费积分修改失败");

    public static CodeMsg MODIFYBANKNUM_SUCCESS = new CodeMsg(500623,"银行卡修改成功");
    public static CodeMsg MODIFYBANKNUM_ERROR = new CodeMsg(500624,"银行卡修改失败");

    public  static CodeMsg MODIFYPASSWORD_SAME = new CodeMsg(500625,"新旧密码重复");
    public  static CodeMsg SAVE_USER_ACTION_FAIL = new CodeMsg(500627,"保存用户修改敏感信息记录失败");
    public  static CodeMsg GET_USER_CREDIT_SCORE_FAIL = new CodeMsg(500628,"获取用户信用积分失败");
    public  static CodeMsg UPDATE_USER_CREDIT_SCORE_FAIL = new CodeMsg(500629,"更新用户信用积分失败");
    public  static CodeMsg GET_USER_RANK_SCORE_FAIL = new CodeMsg(500630,"获取用户等级积分失败");
    public  static CodeMsg UPDATE_USER_RANK_SCORE_FAIL = new CodeMsg(500631,"更新用户等级积分失败");
    public  static CodeMsg VALUE_ERROR = new CodeMsg(500632,"修改的值出错，不可传入非法字符");
    public  static CodeMsg GET_BANKCAR_FAIL = new CodeMsg(500633,"获取银行卡信息失败");
    public  static CodeMsg GET_USER_BY_TEL_FAIL = new CodeMsg(500634,"获取不到该手机号的用户");

    public static CodeMsg REDIS_ERROR = new CodeMsg(500225,"redis服务器出现异常");
    public static CodeMsg COOKIE_ERROR = new CodeMsg(500226,"cookie写入失败");

    //商品模块 5003XX

    //订单模块 5004XX

    //秒杀模块 5005XX
    public static CodeMsg MIAO_SHA_OVER = new CodeMsg(500500, "商品已经秒杀完毕");
    public static CodeMsg REPEATE_MIAOSHA = new CodeMsg(500501, "不能重复秒杀");


    //权限模块 5006XX
    public static CodeMsg UNLOGIN = new CodeMsg(500700, "此用户没有在此平台登录的权限！");
    public static CodeMsg PERMISSION_DENY = new CodeMsg(500701, "当前用户没有权限，无法访问！");
    public static CodeMsg IP_DENY = new CodeMsg(500702, "不允许异地登录！");

    //Toke
    public static CodeMsg PERMISSION_NOT_FOUND = new CodeMsg(600601, "权限不存在");
    public static CodeMsg PERMISSION_USER_NOT_LOGIN = new CodeMsg(600602, "用户未登录");
    public static CodeMsg PERMISSION_TOKEN_EXPIRE = new CodeMsg(600603, "Token过期");


    //verify 7007XX

    public static CodeMsg PROJECT_STATUS_ERR = new CodeMsg(700801, "项目状态错误");
    public static CodeMsg PROJECT_STATUS_CLOSE = new CodeMsg(700801, "业务已关闭");
    public static CodeMsg PROJECT_NAME_ERR = new CodeMsg(700801, "项目名称错误");
    public CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "CodeMsg[" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ']';
    }
}
