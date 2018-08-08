package xyz.ipurple.wechat.base.util;

/**
 * @ClassName: Constants
 * @Description: //TODO
 * @Author: zcy
 * @Date: 2018/8/6 9:47
 * @Version: 1.0
 */
public class Constants {
    public static final String HTTP_OK = "200";
    public static final String QRCODE_TEMP_DIR = "D:\\personal\\temp\\";
    /**
     * 此url用于获取二维码uuid
     */
    public static final String JS_LOGIN_URL = "https://login.wx.qq.com/jslogin";
    /**
     * 获取二维码
     */
    public static final String LOGIN_QRCODE = "https://login.weixin.qq.com/qrcode/";
    /**
     * 登陆监听
     */
    public static final String WAIT_LOGIN = "https://login.wx.qq.com/cgi-bin/mmwebwx-bin/login";
    /**
     * 初始化
     */
    public static final String INIT_URL = "https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxinit";
    /**
     * 消息监听
     */
    public static final String SYNC_CHECK_URL = "https://webpush.wx.qq.com/cgi-bin/mmwebwx-bin/synccheck";
    /**
     * 消息同步
     */
    public static final String WEB_WX_SYNC_URL = "https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxsync";
    /**
     * 状态更新
     */
    public static final String STATUS_NOTIFY_URL = "https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxstatusnotify";

}
