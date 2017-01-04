package bean;

import java.util.List;

/**
 * Created by Administrator on 2016/12/30.
 */

public class SearchBean {
    /**
     * error_code : 0
     * error_msg :
     * data : {"tag":[{"display_title":"外卖红包","obviously":1,"link_type":"category","link_value":"5391"},{"display_title":"流量话费","obviously":1,"link_type":"category","link_value":"5441"},{"display_title":"手机","obviously":0,"link_type":"keyword","link_value":"手机"},{"display_title":"苹果","obviously":0,"link_type":"brand","link_value":"2"},{"display_title":"电脑","obviously":0,"link_type":"keyword","link_value":"电脑"},{"display_title":"京东","obviously":1,"link_type":"keyword","link_value":"京东"},{"display_title":"天猫超市","obviously":1,"link_type":"keyword","link_value":"天猫超市"},{"display_title":"滴滴","obviously":0,"link_type":"keyword","link_value":"滴滴"},{"display_title":"优步","obviously":0,"link_type":"keyword","link_value":"优步"}],"mall":{"guonei":[{"site":"jd.com","name":"京东","ename":"jingdong","mall_id":348,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/3022529%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E4%BA%AC%E4%B8%9C_20151113.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/4359453%E4%BA%AC%E4%B8%9C.jpg"},{"site":"vip.com","name":"唯品会","ename":"weipinhui","mall_id":3003,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/450117QQ%E5%9B%BE%E7%89%8720151118110501.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/629165%E5%94%AF%E5%93%81%E4%BC%9A.jpg"},{"site":"yhd.com","name":"1号店","ename":"yihaodian","mall_id":288,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/QMMImg/2014/12/10/113721751.gif","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/5751151%E5%8F%B7%E5%BA%97.jpg"},{"site":"jumei.com","name":"聚美优品","ename":"jumeiyoupin","mall_id":134,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/42600QQ%E5%9B%BE%E7%89%8720151118110457.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/4542975%E8%81%9A%E7%BE%8E%E4%BC%98%E5%93%81.jpg"},{"site":"xiaojukeji.com","name":"滴滴打车","ename":"dididache","mall_id":17422,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/1455587%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E6%BB%B4%E6%BB%B4_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/2022768%E6%BB%B4%E6%BB%B4.jpg"},{"site":"uber.com","name":"优步","ename":"uber","mall_id":19200,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/1214875%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100Uber_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/274955Uber.jpg"},{"site":"ele.me","name":"饿了么","ename":"eleme","mall_id":19130,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/3850219eleme.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/308518%E9%A5%BF%E4%BA%86%E4%B9%88.jpg"},{"site":"gome.com.cn","name":"国美在线","ename":"guomei","mall_id":1,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/187390.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/3539160%E5%9B%BD%E7%BE%8E%E5%9C%A8%E7%BA%BF.jpg"},{"site":"nuomi.com","name":"百度糯米","ename":"nuomiwang","mall_id":237,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/2158637%E7%99%BE%E5%BA%A6%E7%B3%AF%E7%B1%B3.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/5820120%E7%99%BE%E5%BA%A6%E7%B3%AF%E7%B1%B3.jpg"},{"site":"kaola.com","name":"网易考拉海购","ename":"kaolahaigou","mall_id":17489,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/2131843%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E8%80%83%E6%8B%89%E6%B5%B7%E8%B4%AD_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/5415576%E7%BD%91%E6%98%93%E8%80%83%E6%8B%89.jpg"},{"site":"waimai.meituan.com","name":"美团外卖","ename":"meituanwaimai","mall_id":17476,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/3122745%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E7%BE%8E%E5%9B%A2%E5%A4%96%E5%8D%96_20151113.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/732270%E7%BE%8E%E5%9B%A2%E5%A4%96%E5%8D%96.jpg"},{"site":"wepiao.com","name":"微信电影票","ename":"weipiaoer","mall_id":19416,"summary":"","detail_info":"","img":"http://image3.quanmama.com/AdminImageUpload/40185670.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/611241%E5%BE%AE%E7%A5%A8%E5%84%BF.jpg"},{"site":"womai.com","name":"我买网","ename":"womaiwang","mall_id":90,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/4116887wmw.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/2936571%E6%88%91%E4%B9%B0%E7%BD%91.jpg"},{"site":"htinns.com","name":"汉庭","ename":"hanting","mall_id":1325,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/31269220160608173323.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/3621639%E6%B1%89%E5%BA%AD.jpg"},{"site":"suning.com","name":"苏宁易购","ename":"suningyigou","mall_id":382,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/534141QQ%E5%9B%BE%E7%89%8720151118110506.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/510229%E8%8B%8F%E5%AE%81%E6%98%93%E8%B4%AD.jpg"},{"site":"waimai.baidu.com","name":"百度外卖","ename":"baiduwaimai","mall_id":17403,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/5241181%E7%99%BE%E5%BA%A6%E5%A4%96%E5%8D%96logo.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/857646%E7%99%BE%E5%BA%A6%E5%A4%96%E5%8D%96.jpg"}],"haiwai":[{"site":"asos.cn","name":"asos","ename":"asos","mall_id":3036,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/ImageUpload/201418172842266.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/04673asos.jpg"},{"site":"6pm.com","name":"6PM","ename":"6pm","mall_id":3062,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/37294076pm.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"shopbop.com","name":"shopbop","ename":"shopbop","mall_id":3129,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/456363Shopbop.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"ashford.com","name":"Ashford","ename":"ashford","mall_id":3027,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/14580Ashford.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/758912ashford.jpg"},{"site":"strawberrynet.com","name":"草莓网","ename":"caomeiwang","mall_id":190,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/1153869StrawberryNET.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"amazon.com","name":"美国Amazon","ename":"meiguoyamaxun","mall_id":3017,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/ImageUpload/20131225232427661.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"rakuten.com","name":"Rakuten","ename":"rakutenglobalmarket","mall_id":17438,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/1930658Rakuten-Global-Market.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"ebay.com","name":"ebay","ename":"ebay","mall_id":3080,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/159202eBay.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"}],"version":1},"category":[{"id":"1156","name":"本地生活","img":"http://image2.juanlaoda.com/AdminImageUpload/1165250.png"},{"id":"5417","name":"旅游酒店","img":"http://image1.juanlaoda.com/AdminImageUpload/6581500.png"},{"id":"569","name":"手机相机","img":"http://image2.juanlaoda.com/AdminImageUpload/4361010.png"},{"id":"5420","name":"家用电器","img":"http://image2.juanlaoda.com/AdminImageUpload/44388740.png"},{"id":"166","name":"电脑办公","img":"http://image1.juanlaoda.com/AdminImageUpload/3548817798.png"},{"id":"1","name":"图书音像","img":"http://image1.juanlaoda.com/AdminImageUpload/9235130.png"},{"id":"252","name":"美妆个护","img":"http://image2.juanlaoda.com/AdminImageUpload/48435610.png"},{"id":"763","name":"服饰鞋包","img":"http://image2.juanlaoda.com/AdminImageUpload/49589090.png"},{"id":"5416","name":"投资理财","img":"http://image3.juanlaoda.com/AdminImageUpload/28522020.png"},{"id":"647","name":"家居家装","img":"http://image3.juanlaoda.com/AdminImageUpload/59573260.png"},{"id":"299","name":"母婴玩具","img":"http://image2.juanlaoda.com/AdminImageUpload/217400.png"},{"id":"1045","name":"运动户外","img":"http://image3.juanlaoda.com/AdminImageUpload/5236985h.png"},{"id":"381","name":"食品饮料","img":"http://image2.juanlaoda.com/AdminImageUpload/31271115210356s.png"},{"id":"441","name":"汽车用品","img":"http://image1.juanlaoda.com/AdminImageUpload/6358290.png"},{"id":"879","name":"礼品钟表","img":"http://image2.juanlaoda.com/AdminImageUpload/428390.png"},{"id":"1316","name":"医药保健","img":"http://image3.juanlaoda.com/AdminImageUpload/5426330.png"}],"version":1}
     */

    private String error_code;
    private String error_msg;
    private DataBean data;

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * tag : [{"display_title":"外卖红包","obviously":1,"link_type":"category","link_value":"5391"},{"display_title":"流量话费","obviously":1,"link_type":"category","link_value":"5441"},{"display_title":"手机","obviously":0,"link_type":"keyword","link_value":"手机"},{"display_title":"苹果","obviously":0,"link_type":"brand","link_value":"2"},{"display_title":"电脑","obviously":0,"link_type":"keyword","link_value":"电脑"},{"display_title":"京东","obviously":1,"link_type":"keyword","link_value":"京东"},{"display_title":"天猫超市","obviously":1,"link_type":"keyword","link_value":"天猫超市"},{"display_title":"滴滴","obviously":0,"link_type":"keyword","link_value":"滴滴"},{"display_title":"优步","obviously":0,"link_type":"keyword","link_value":"优步"}]
         * mall : {"guonei":[{"site":"jd.com","name":"京东","ename":"jingdong","mall_id":348,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/3022529%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E4%BA%AC%E4%B8%9C_20151113.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/4359453%E4%BA%AC%E4%B8%9C.jpg"},{"site":"vip.com","name":"唯品会","ename":"weipinhui","mall_id":3003,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/450117QQ%E5%9B%BE%E7%89%8720151118110501.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/629165%E5%94%AF%E5%93%81%E4%BC%9A.jpg"},{"site":"yhd.com","name":"1号店","ename":"yihaodian","mall_id":288,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/QMMImg/2014/12/10/113721751.gif","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/5751151%E5%8F%B7%E5%BA%97.jpg"},{"site":"jumei.com","name":"聚美优品","ename":"jumeiyoupin","mall_id":134,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/42600QQ%E5%9B%BE%E7%89%8720151118110457.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/4542975%E8%81%9A%E7%BE%8E%E4%BC%98%E5%93%81.jpg"},{"site":"xiaojukeji.com","name":"滴滴打车","ename":"dididache","mall_id":17422,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/1455587%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E6%BB%B4%E6%BB%B4_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/2022768%E6%BB%B4%E6%BB%B4.jpg"},{"site":"uber.com","name":"优步","ename":"uber","mall_id":19200,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/1214875%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100Uber_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/274955Uber.jpg"},{"site":"ele.me","name":"饿了么","ename":"eleme","mall_id":19130,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/3850219eleme.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/308518%E9%A5%BF%E4%BA%86%E4%B9%88.jpg"},{"site":"gome.com.cn","name":"国美在线","ename":"guomei","mall_id":1,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/187390.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/3539160%E5%9B%BD%E7%BE%8E%E5%9C%A8%E7%BA%BF.jpg"},{"site":"nuomi.com","name":"百度糯米","ename":"nuomiwang","mall_id":237,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/2158637%E7%99%BE%E5%BA%A6%E7%B3%AF%E7%B1%B3.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/5820120%E7%99%BE%E5%BA%A6%E7%B3%AF%E7%B1%B3.jpg"},{"site":"kaola.com","name":"网易考拉海购","ename":"kaolahaigou","mall_id":17489,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/2131843%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E8%80%83%E6%8B%89%E6%B5%B7%E8%B4%AD_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/5415576%E7%BD%91%E6%98%93%E8%80%83%E6%8B%89.jpg"},{"site":"waimai.meituan.com","name":"美团外卖","ename":"meituanwaimai","mall_id":17476,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/3122745%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E7%BE%8E%E5%9B%A2%E5%A4%96%E5%8D%96_20151113.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/732270%E7%BE%8E%E5%9B%A2%E5%A4%96%E5%8D%96.jpg"},{"site":"wepiao.com","name":"微信电影票","ename":"weipiaoer","mall_id":19416,"summary":"","detail_info":"","img":"http://image3.quanmama.com/AdminImageUpload/40185670.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/611241%E5%BE%AE%E7%A5%A8%E5%84%BF.jpg"},{"site":"womai.com","name":"我买网","ename":"womaiwang","mall_id":90,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/4116887wmw.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/2936571%E6%88%91%E4%B9%B0%E7%BD%91.jpg"},{"site":"htinns.com","name":"汉庭","ename":"hanting","mall_id":1325,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/31269220160608173323.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/3621639%E6%B1%89%E5%BA%AD.jpg"},{"site":"suning.com","name":"苏宁易购","ename":"suningyigou","mall_id":382,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/534141QQ%E5%9B%BE%E7%89%8720151118110506.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/510229%E8%8B%8F%E5%AE%81%E6%98%93%E8%B4%AD.jpg"},{"site":"waimai.baidu.com","name":"百度外卖","ename":"baiduwaimai","mall_id":17403,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/5241181%E7%99%BE%E5%BA%A6%E5%A4%96%E5%8D%96logo.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/857646%E7%99%BE%E5%BA%A6%E5%A4%96%E5%8D%96.jpg"}],"haiwai":[{"site":"asos.cn","name":"asos","ename":"asos","mall_id":3036,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/ImageUpload/201418172842266.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/04673asos.jpg"},{"site":"6pm.com","name":"6PM","ename":"6pm","mall_id":3062,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/37294076pm.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"shopbop.com","name":"shopbop","ename":"shopbop","mall_id":3129,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/456363Shopbop.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"ashford.com","name":"Ashford","ename":"ashford","mall_id":3027,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/14580Ashford.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/758912ashford.jpg"},{"site":"strawberrynet.com","name":"草莓网","ename":"caomeiwang","mall_id":190,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/1153869StrawberryNET.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"amazon.com","name":"美国Amazon","ename":"meiguoyamaxun","mall_id":3017,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/ImageUpload/20131225232427661.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"rakuten.com","name":"Rakuten","ename":"rakutenglobalmarket","mall_id":17438,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/1930658Rakuten-Global-Market.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"ebay.com","name":"ebay","ename":"ebay","mall_id":3080,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/159202eBay.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"}],"version":1}
         * category : [{"id":"1156","name":"本地生活","img":"http://image2.juanlaoda.com/AdminImageUpload/1165250.png"},{"id":"5417","name":"旅游酒店","img":"http://image1.juanlaoda.com/AdminImageUpload/6581500.png"},{"id":"569","name":"手机相机","img":"http://image2.juanlaoda.com/AdminImageUpload/4361010.png"},{"id":"5420","name":"家用电器","img":"http://image2.juanlaoda.com/AdminImageUpload/44388740.png"},{"id":"166","name":"电脑办公","img":"http://image1.juanlaoda.com/AdminImageUpload/3548817798.png"},{"id":"1","name":"图书音像","img":"http://image1.juanlaoda.com/AdminImageUpload/9235130.png"},{"id":"252","name":"美妆个护","img":"http://image2.juanlaoda.com/AdminImageUpload/48435610.png"},{"id":"763","name":"服饰鞋包","img":"http://image2.juanlaoda.com/AdminImageUpload/49589090.png"},{"id":"5416","name":"投资理财","img":"http://image3.juanlaoda.com/AdminImageUpload/28522020.png"},{"id":"647","name":"家居家装","img":"http://image3.juanlaoda.com/AdminImageUpload/59573260.png"},{"id":"299","name":"母婴玩具","img":"http://image2.juanlaoda.com/AdminImageUpload/217400.png"},{"id":"1045","name":"运动户外","img":"http://image3.juanlaoda.com/AdminImageUpload/5236985h.png"},{"id":"381","name":"食品饮料","img":"http://image2.juanlaoda.com/AdminImageUpload/31271115210356s.png"},{"id":"441","name":"汽车用品","img":"http://image1.juanlaoda.com/AdminImageUpload/6358290.png"},{"id":"879","name":"礼品钟表","img":"http://image2.juanlaoda.com/AdminImageUpload/428390.png"},{"id":"1316","name":"医药保健","img":"http://image3.juanlaoda.com/AdminImageUpload/5426330.png"}]
         * version : 1
         */

        private MallBean mall;
        private int version;
        private List<TagBean> tag;
        private List<CategoryBean> category;

        public MallBean getMall() {
            return mall;
        }

        public void setMall(MallBean mall) {
            this.mall = mall;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public List<TagBean> getTag() {
            return tag;
        }

        public void setTag(List<TagBean> tag) {
            this.tag = tag;
        }

        public List<CategoryBean> getCategory() {
            return category;
        }

        public void setCategory(List<CategoryBean> category) {
            this.category = category;
        }

        public static class MallBean {
            /**
             * guonei : [{"site":"jd.com","name":"京东","ename":"jingdong","mall_id":348,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/3022529%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E4%BA%AC%E4%B8%9C_20151113.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/4359453%E4%BA%AC%E4%B8%9C.jpg"},{"site":"vip.com","name":"唯品会","ename":"weipinhui","mall_id":3003,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/450117QQ%E5%9B%BE%E7%89%8720151118110501.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/629165%E5%94%AF%E5%93%81%E4%BC%9A.jpg"},{"site":"yhd.com","name":"1号店","ename":"yihaodian","mall_id":288,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/QMMImg/2014/12/10/113721751.gif","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/5751151%E5%8F%B7%E5%BA%97.jpg"},{"site":"jumei.com","name":"聚美优品","ename":"jumeiyoupin","mall_id":134,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/42600QQ%E5%9B%BE%E7%89%8720151118110457.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/4542975%E8%81%9A%E7%BE%8E%E4%BC%98%E5%93%81.jpg"},{"site":"xiaojukeji.com","name":"滴滴打车","ename":"dididache","mall_id":17422,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/1455587%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E6%BB%B4%E6%BB%B4_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/2022768%E6%BB%B4%E6%BB%B4.jpg"},{"site":"uber.com","name":"优步","ename":"uber","mall_id":19200,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/1214875%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100Uber_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/274955Uber.jpg"},{"site":"ele.me","name":"饿了么","ename":"eleme","mall_id":19130,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/3850219eleme.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/308518%E9%A5%BF%E4%BA%86%E4%B9%88.jpg"},{"site":"gome.com.cn","name":"国美在线","ename":"guomei","mall_id":1,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/187390.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/3539160%E5%9B%BD%E7%BE%8E%E5%9C%A8%E7%BA%BF.jpg"},{"site":"nuomi.com","name":"百度糯米","ename":"nuomiwang","mall_id":237,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/2158637%E7%99%BE%E5%BA%A6%E7%B3%AF%E7%B1%B3.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/5820120%E7%99%BE%E5%BA%A6%E7%B3%AF%E7%B1%B3.jpg"},{"site":"kaola.com","name":"网易考拉海购","ename":"kaolahaigou","mall_id":17489,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/2131843%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E8%80%83%E6%8B%89%E6%B5%B7%E8%B4%AD_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/5415576%E7%BD%91%E6%98%93%E8%80%83%E6%8B%89.jpg"},{"site":"waimai.meituan.com","name":"美团外卖","ename":"meituanwaimai","mall_id":17476,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/3122745%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E7%BE%8E%E5%9B%A2%E5%A4%96%E5%8D%96_20151113.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/732270%E7%BE%8E%E5%9B%A2%E5%A4%96%E5%8D%96.jpg"},{"site":"wepiao.com","name":"微信电影票","ename":"weipiaoer","mall_id":19416,"summary":"","detail_info":"","img":"http://image3.quanmama.com/AdminImageUpload/40185670.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/611241%E5%BE%AE%E7%A5%A8%E5%84%BF.jpg"},{"site":"womai.com","name":"我买网","ename":"womaiwang","mall_id":90,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/4116887wmw.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/2936571%E6%88%91%E4%B9%B0%E7%BD%91.jpg"},{"site":"htinns.com","name":"汉庭","ename":"hanting","mall_id":1325,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/31269220160608173323.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/3621639%E6%B1%89%E5%BA%AD.jpg"},{"site":"suning.com","name":"苏宁易购","ename":"suningyigou","mall_id":382,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/534141QQ%E5%9B%BE%E7%89%8720151118110506.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/510229%E8%8B%8F%E5%AE%81%E6%98%93%E8%B4%AD.jpg"},{"site":"waimai.baidu.com","name":"百度外卖","ename":"baiduwaimai","mall_id":17403,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/5241181%E7%99%BE%E5%BA%A6%E5%A4%96%E5%8D%96logo.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/857646%E7%99%BE%E5%BA%A6%E5%A4%96%E5%8D%96.jpg"}]
             * haiwai : [{"site":"asos.cn","name":"asos","ename":"asos","mall_id":3036,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/ImageUpload/201418172842266.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/04673asos.jpg"},{"site":"6pm.com","name":"6PM","ename":"6pm","mall_id":3062,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/37294076pm.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"shopbop.com","name":"shopbop","ename":"shopbop","mall_id":3129,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/456363Shopbop.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"ashford.com","name":"Ashford","ename":"ashford","mall_id":3027,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/14580Ashford.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/758912ashford.jpg"},{"site":"strawberrynet.com","name":"草莓网","ename":"caomeiwang","mall_id":190,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/1153869StrawberryNET.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"amazon.com","name":"美国Amazon","ename":"meiguoyamaxun","mall_id":3017,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/ImageUpload/20131225232427661.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"rakuten.com","name":"Rakuten","ename":"rakutenglobalmarket","mall_id":17438,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/1930658Rakuten-Global-Market.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"ebay.com","name":"ebay","ename":"ebay","mall_id":3080,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/159202eBay.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"}]
             * version : 1
             */

            private int version;
            private List<GuoneiBean> guonei;
            private List<HaiwaiBean> haiwai;

            public int getVersion() {
                return version;
            }

            public void setVersion(int version) {
                this.version = version;
            }

            public List<GuoneiBean> getGuonei() {
                return guonei;
            }

            public void setGuonei(List<GuoneiBean> guonei) {
                this.guonei = guonei;
            }

            public List<HaiwaiBean> getHaiwai() {
                return haiwai;
            }

            public void setHaiwai(List<HaiwaiBean> haiwai) {
                this.haiwai = haiwai;
            }

            public static class GuoneiBean {
                /**
                 * site : jd.com
                 * name : 京东
                 * ename : jingdong
                 * mall_id : 348
                 * summary :
                 * detail_info :
                 * img : http://image1.juanlaoda.com/AdminImageUpload/3022529%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E4%BA%AC%E4%B8%9C_20151113.png
                 * img_w : 0
                 * img_h : 0
                 * isKfc : 0
                 * show_logo_img : 0
                 * background_img : http://image3.juanlaoda.com/AdminImageUpload/4359453%E4%BA%AC%E4%B8%9C.jpg
                 */

                private String site;
                private String name;
                private String ename;
                private int mall_id;
                private String summary;
                private String detail_info;
                private String img;
                private int img_w;
                private int img_h;
                private String isKfc;
                private String show_logo_img;
                private String background_img;

                public String getSite() {
                    return site;
                }

                public void setSite(String site) {
                    this.site = site;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEname() {
                    return ename;
                }

                public void setEname(String ename) {
                    this.ename = ename;
                }

                public int getMall_id() {
                    return mall_id;
                }

                public void setMall_id(int mall_id) {
                    this.mall_id = mall_id;
                }

                public String getSummary() {
                    return summary;
                }

                public void setSummary(String summary) {
                    this.summary = summary;
                }

                public String getDetail_info() {
                    return detail_info;
                }

                public void setDetail_info(String detail_info) {
                    this.detail_info = detail_info;
                }

                public String getImg() {
                    return img;
                }

                public void setImg(String img) {
                    this.img = img;
                }

                public int getImg_w() {
                    return img_w;
                }

                public void setImg_w(int img_w) {
                    this.img_w = img_w;
                }

                public int getImg_h() {
                    return img_h;
                }

                public void setImg_h(int img_h) {
                    this.img_h = img_h;
                }

                public String getIsKfc() {
                    return isKfc;
                }

                public void setIsKfc(String isKfc) {
                    this.isKfc = isKfc;
                }

                public String getShow_logo_img() {
                    return show_logo_img;
                }

                public void setShow_logo_img(String show_logo_img) {
                    this.show_logo_img = show_logo_img;
                }

                public String getBackground_img() {
                    return background_img;
                }

                public void setBackground_img(String background_img) {
                    this.background_img = background_img;
                }
            }

            public static class HaiwaiBean {
                /**
                 * site : asos.cn
                 * name : asos
                 * ename : asos
                 * mall_id : 3036
                 * summary :
                 * detail_info :
                 * img : http://www.juanlaoda.com/ImageUpload/201418172842266.jpg
                 * img_w : 0
                 * img_h : 0
                 * isKfc : 0
                 * show_logo_img : 0
                 * background_img : http://image1.juanlaoda.com/AdminImageUpload/04673asos.jpg
                 */

                private String site;
                private String name;
                private String ename;
                private int mall_id;
                private String summary;
                private String detail_info;
                private String img;
                private int img_w;
                private int img_h;
                private String isKfc;
                private String show_logo_img;
                private String background_img;

                public String getSite() {
                    return site;
                }

                public void setSite(String site) {
                    this.site = site;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEname() {
                    return ename;
                }

                public void setEname(String ename) {
                    this.ename = ename;
                }

                public int getMall_id() {
                    return mall_id;
                }

                public void setMall_id(int mall_id) {
                    this.mall_id = mall_id;
                }

                public String getSummary() {
                    return summary;
                }

                public void setSummary(String summary) {
                    this.summary = summary;
                }

                public String getDetail_info() {
                    return detail_info;
                }

                public void setDetail_info(String detail_info) {
                    this.detail_info = detail_info;
                }

                public String getImg() {
                    return img;
                }

                public void setImg(String img) {
                    this.img = img;
                }

                public int getImg_w() {
                    return img_w;
                }

                public void setImg_w(int img_w) {
                    this.img_w = img_w;
                }

                public int getImg_h() {
                    return img_h;
                }

                public void setImg_h(int img_h) {
                    this.img_h = img_h;
                }

                public String getIsKfc() {
                    return isKfc;
                }

                public void setIsKfc(String isKfc) {
                    this.isKfc = isKfc;
                }

                public String getShow_logo_img() {
                    return show_logo_img;
                }

                public void setShow_logo_img(String show_logo_img) {
                    this.show_logo_img = show_logo_img;
                }

                public String getBackground_img() {
                    return background_img;
                }

                public void setBackground_img(String background_img) {
                    this.background_img = background_img;
                }
            }
        }

        public static class TagBean {
            /**
             * display_title : 外卖红包
             * obviously : 1
             * link_type : category
             * link_value : 5391
             */

            private String display_title;
            private int obviously;
            private String link_type;
            private String link_value;

            public String getDisplay_title() {
                return display_title;
            }

            public void setDisplay_title(String display_title) {
                this.display_title = display_title;
            }

            public int getObviously() {
                return obviously;
            }

            public void setObviously(int obviously) {
                this.obviously = obviously;
            }

            public String getLink_type() {
                return link_type;
            }

            public void setLink_type(String link_type) {
                this.link_type = link_type;
            }

            public String getLink_value() {
                return link_value;
            }

            public void setLink_value(String link_value) {
                this.link_value = link_value;
            }
        }

        public static class CategoryBean {
            /**
             * id : 1156
             * name : 本地生活
             * img : http://image2.juanlaoda.com/AdminImageUpload/1165250.png
             */

            private String id;
            private String name;
            private String img;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }
        }
    }
}
