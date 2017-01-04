package utils;

import android.app.Activity;
import android.widget.Toast;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.shareboard.ShareBoardConfig;

/**
 * Created by Administrator on 2016/12/29.
 */

public class ShareUtils {
    public static void ShareOpen(final Activity activity, String title,
                                 String text, String targetUrl, UMImage image ) {
        PlatformConfig.setWeixin(Contant.wxappId,
                Contant.wxappSecret);
        PlatformConfig.setQQZone("1105719064",
                "Jqrb0VW75LrgoYsf");

        ShareBoardConfig config = new ShareBoardConfig();
        config.setShareboardPostion(ShareBoardConfig.SHAREBOARD_POSITION_CENTER);
        config.setMenuItemBackgroundShape(ShareBoardConfig.BG_SHAPE_CIRCULAR);
        config.setCancelButtonVisibility(true);
        PlatformConfig.setSinaWeibo(Contant.sinaappId,
                Contant.sinaappSecret);
        final SHARE_MEDIA[] displaylist = new SHARE_MEDIA[]{
                SHARE_MEDIA.WEIXIN, SHARE_MEDIA.WEIXIN_CIRCLE, SHARE_MEDIA.QQ,
                SHARE_MEDIA.QZONE, SHARE_MEDIA.SINA};
        new ShareAction(activity).setDisplayList(displaylist).withText(text)
                .withTitle(title).withTargetUrl(targetUrl).withMedia(image)

                .setListenerList(new UMShareListener() {

                    @Override
                    public void onResult(SHARE_MEDIA arg0) {
                        // TODO Auto-generated method stub
                        Toast.makeText(activity, " 分享成功啦", Toast.LENGTH_SHORT)
                                .show();
                    }

                    @Override
                    public void onError(SHARE_MEDIA arg0, Throwable arg1) {
                        // TODO Auto-generated method stub
                        Toast.makeText(activity, " 分享失败啦", Toast.LENGTH_SHORT)
                                .show();
                    }

                    @Override
                    public void onCancel(SHARE_MEDIA arg0) {
                        // TODO Auto-generated method stub
                        Toast.makeText(activity, " 分享取消啦", Toast.LENGTH_SHORT)
                                .show();
                    }
                }).open(config);
    }
}
