package config;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;

import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiscCache;
import com.nostra13.universalimageloader.cache.disc.naming.HashCodeFileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.LruMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.decode.BaseImageDecoder;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.nostra13.universalimageloader.utils.StorageUtils;
import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

import org.xutils.x;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/27.
 */

public class MyApp extends Application {

    private static MyApp ourInstance = new MyApp();

    public static MyApp getInstance() {
        return ourInstance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        UMShareAPI.get(this);
        PlatformConfig.setWeixin("wxdc1e388c3822c80b", "3baf1193c85774b3fd9d18447d76cab0");
        //豆瓣RENREN平台目前只能在服务器端配置
        //新浪微博
        PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad");
        //易信
        PlatformConfig.setQQZone("1105719064", "Jqrb0VW75LrgoYsf");
        File cacheDir = StorageUtils
                .getOwnCacheDirectory(this, "xiangcuntiandi/xiangcuntiandi");
        // 创建默认的ImageLoader配置参数
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(
                this)
                .memoryCacheExtraOptions(480, 800)
                // default = device screen dimensions
                // .discCacheExtraOptions(480, 800, CompressFormat.JPEG, 75,
                // null)
                .threadPoolSize(3)
                // default
                .threadPriority(Thread.NORM_PRIORITY - 2)
                // default
                .tasksProcessingOrder(QueueProcessingType.FIFO)
                // defaults
                .denyCacheImageMultipleSizesInMemory()
                .memoryCache(new LruMemoryCache(2 * 1024 * 1024))
                .memoryCacheSize(2 * 1024 * 1024).memoryCacheSizePercentage(13)
                // default
                .discCache(new UnlimitedDiscCache(cacheDir))
                // default
                .discCacheSize(20 * 1024 * 1024).discCacheFileCount(100)
                .discCacheFileNameGenerator(new HashCodeFileNameGenerator()) // default
                .imageDownloader(new BaseImageDownloader(this)) // default
                .imageDecoder(new BaseImageDecoder(false)) // default
                .defaultDisplayImageOptions(DisplayImageOptions.createSimple()) // default
                .writeDebugLogs().build();
        imageLoader = ImageLoader.getInstance();
        imageLoader.init(configuration);

    }


    List<Activity> activityList=new ArrayList<>();

    public void AddActivity(Activity context){
        activityList.add(context);
    }
    public void finishActivity(){
        for (Activity activity : activityList) {
            activity.finish();
        }
    }
    private String username;
    private String headpic;

    public void setHeadpic(String headpic) {
        this.headpic = headpic;
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String userToken="FD3F719004CBED9A59DC89237D8F0658D47B75F4836D27C481C64175F563D689D0D06855C07B4FE337EFA64E1B2DD8C373843ACA829D272643B957F02521285DB4EF7BE053D04B5B7ADFBA4B00DD4A76F7D8FB914825D273E55703C888260EB57ABFF6760E3510B86D6B1C1CB0AB4803744675352038AB08C960952D7618D54EF329E517D57E0DB4F3077F36B4881A5BC46ED8A97DB335E04FEF6B6CEA0395F4A402D4F5518D650DEBF9ECAC48F439C92A594978AF4CCA1BBB1368BFE14836DA";

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getUserToken() {
        return userToken;
    }
    public static DisplayImageOptions getFadeOptions(int loadingImageResId,
                                                     int errorImageResid, int emptyImageResId) {
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                // 设置图片在下载期间显示的图片
                .showImageOnLoading(loadingImageResId)
                // 设置图片加载/解码过程中错误时候显示的图片
                .showImageOnFail(errorImageResid)
                // 设置图片Uri为空或是错误的时候显示的图片
                .showImageForEmptyUri(emptyImageResId)
                // 设置下载的图片是否缓存在内存�?
                .cacheInMemory(true)
                // 设置下载的图片是否缓存在SD卡中
                .cacheOnDisc(true)
                /**
                 * 设置图片缩放方式�? EXACTLY :图像将完全按比例缩小到目标大�?
                 * EXACTLY_STRETCHED:图片会缩放到目标大小完全 IN_SAMPLE_INT:图像将被二次采样的整数�??
                 * IN_SAMPLE_POWER_OF_2:图片将降�?2倍，直到下一减少步骤，使图像更小的目标大�? NONE:图片不会调整
                 ***/
                .imageScaleType(ImageScaleType.EXACTLY_STRETCHED)
                // 设置图片的解码类�?
                .bitmapConfig(Bitmap.Config.RGB_565)
                // 设置图片下载前的延迟
                .delayBeforeLoading(100)
                // delayInMillis为你设置的延迟时�?
                // 设置图片加入缓存前，对bitmap进行设置
                // .preProcessor(BitmapProcessor preProcessor)

                /**
                 * 图片显示方式�? RoundedBitmapDisplayer（int roundPixels）设置圆角图�?
                 * FakeBitmapDisplayer（）这个类什么都没做 FadeInBitmapDisplayer（int
                 * durationMillis）设置图片渐显的时间 �?�?�?�?
                 * *�?SimpleBitmapDisplayer()正常显示�?张图�?
                 **/
                .displayer(new FadeInBitmapDisplayer(1000))// 渐显--设置图片渐显的时�?
                .build();
        return options;
    }

    public static DisplayImageOptions getFadeOptions1(int loadingImageResId,
                                                      int errorImageResid, int emptyImageResId) {
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                // 设置图片在下载期间显示的图片
                .showImageOnLoading(loadingImageResId)
                // 设置图片加载/解码过程中错误时候显示的图片
                .showImageOnFail(errorImageResid)
                // 设置图片Uri为空或是错误的时候显示的图片
                .showImageForEmptyUri(emptyImageResId)
                // 设置下载的图片是否缓存在内存�?
                .cacheInMemory(true)
                // 设置下载的图片是否缓存在SD卡中
                .cacheOnDisc(true)
                /**
                 * 设置图片缩放方式�? EXACTLY :图像将完全按比例缩小到目标大�?
                 * EXACTLY_STRETCHED:图片会缩放到目标大小完全 IN_SAMPLE_INT:图像将被二次采样的整数�??
                 * IN_SAMPLE_POWER_OF_2:图片将降�?2倍，直到下一减少步骤，使图像更小的目标大�? NONE:图片不会调整
                 ***/
                .imageScaleType(ImageScaleType.EXACTLY_STRETCHED)
                // 设置图片的解码类�?
                .bitmapConfig(Bitmap.Config.RGB_565)
                // 设置图片下载前的延迟
                .delayBeforeLoading(100)
                // delayInMillis为你设置的延迟时�?
                // 设置图片加入缓存前，对bitmap进行设置
                // .preProcessor(BitmapProcessor preProcessor)

                /**
                 * 图片显示方式�? RoundedBitmapDisplayer（int roundPixels）设置圆角图�?
                 * FakeBitmapDisplayer（）这个类什么都没做 FadeInBitmapDisplayer（int
                 * durationMillis）设置图片渐显的时间 �?�?�?�?
                 * *�?SimpleBitmapDisplayer()正常显示�?张图�?
                 **/
                .displayer(new RoundedBitmapDisplayer(100))// 渐显--设置图片渐显的时�?
                .build();
        return options;
    }

    /**
     * 获取默认显示配置选项
     */
    public static DisplayImageOptions getDefaultOptions() {
        return DisplayImageOptions.createSimple();
    }

    /**
     * 清除缓存
     */
    private static ImageLoader imageLoader;
    public static void clearCache() {
        imageLoader.clearMemoryCache();
        imageLoader.clearDiscCache();
    }

    public static ImageLoader getImageLoader() {
        return imageLoader;
    }

}
