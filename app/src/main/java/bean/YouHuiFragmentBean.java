package bean;

import java.util.List;

/**
 * Created by Administrator on 2016/12/31.
 */

public class YouHuiFragmentBean {
    /**
     * error_code : 0
     * error_msg :
     * data : {"rows":[{"article_id":0,"banner_title":"2017新春红包","banner_pic":"http://image2.quanmama.com/AdminImageUpload/3269893256.jpg","banner_order":0,"sub_type":"detail","sub_value":"1879599","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636186187613160684","banner_params":"{}"},{"article_id":0,"banner_title":"饿了么红包","banner_pic":"http://image2.quanmama.com/AdminImageUpload/47103610.jpg","banner_order":0,"sub_type":"detail","sub_value":"1846610","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636173322981654790","banner_params":"{}"},{"article_id":0,"banner_title":"电影红包","banner_pic":"http://image2.quanmama.com/AdminImageUpload/12294640.jpg","banner_order":0,"sub_type":"detail","sub_value":"1683735","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636173323035719366","banner_params":"{}"}],"little_banner":[],"hot_malls":[{"site":"jd.com","name":"京东","ename":"jingdong","mall_id":348,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/3022529%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E4%BA%AC%E4%B8%9C_20151113.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/4359453%E4%BA%AC%E4%B8%9C.jpg"},{"site":"vip.com","name":"唯品会","ename":"weipinhui","mall_id":3003,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/450117QQ%E5%9B%BE%E7%89%8720151118110501.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/629165%E5%94%AF%E5%93%81%E4%BC%9A.jpg"},{"site":"yhd.com","name":"1号店","ename":"yihaodian","mall_id":288,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/QMMImg/2014/12/10/113721751.gif","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/5751151%E5%8F%B7%E5%BA%97.jpg"},{"site":"jumei.com","name":"聚美优品","ename":"jumeiyoupin","mall_id":134,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/42600QQ%E5%9B%BE%E7%89%8720151118110457.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/4542975%E8%81%9A%E7%BE%8E%E4%BC%98%E5%93%81.jpg"},{"site":"xiaojukeji.com","name":"滴滴打车","ename":"dididache","mall_id":17422,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/1455587%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E6%BB%B4%E6%BB%B4_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/2022768%E6%BB%B4%E6%BB%B4.jpg"},{"site":"uber.com","name":"优步","ename":"uber","mall_id":19200,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/1214875%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100Uber_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/274955Uber.jpg"},{"site":"ele.me","name":"饿了么","ename":"eleme","mall_id":19130,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/3850219eleme.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/308518%E9%A5%BF%E4%BA%86%E4%B9%88.jpg"},{"site":"gome.com.cn","name":"国美在线","ename":"guomei","mall_id":1,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/187390.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/3539160%E5%9B%BD%E7%BE%8E%E5%9C%A8%E7%BA%BF.jpg"},{"site":"nuomi.com","name":"百度糯米","ename":"nuomiwang","mall_id":237,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/2158637%E7%99%BE%E5%BA%A6%E7%B3%AF%E7%B1%B3.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/5820120%E7%99%BE%E5%BA%A6%E7%B3%AF%E7%B1%B3.jpg"},{"site":"kaola.com","name":"网易考拉海购","ename":"kaolahaigou","mall_id":17489,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/2131843%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E8%80%83%E6%8B%89%E6%B5%B7%E8%B4%AD_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/5415576%E7%BD%91%E6%98%93%E8%80%83%E6%8B%89.jpg"},{"site":"waimai.meituan.com","name":"美团外卖","ename":"meituanwaimai","mall_id":17476,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/3122745%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E7%BE%8E%E5%9B%A2%E5%A4%96%E5%8D%96_20151113.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/732270%E7%BE%8E%E5%9B%A2%E5%A4%96%E5%8D%96.jpg"},{"site":"wepiao.com","name":"微信电影票","ename":"weipiaoer","mall_id":19416,"summary":"","detail_info":"","img":"http://image3.quanmama.com/AdminImageUpload/40185670.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/611241%E5%BE%AE%E7%A5%A8%E5%84%BF.jpg"},{"site":"womai.com","name":"我买网","ename":"womaiwang","mall_id":90,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/4116887wmw.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/2936571%E6%88%91%E4%B9%B0%E7%BD%91.jpg"},{"site":"htinns.com","name":"汉庭","ename":"hanting","mall_id":1325,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/31269220160608173323.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/3621639%E6%B1%89%E5%BA%AD.jpg"},{"site":"suning.com","name":"苏宁易购","ename":"suningyigou","mall_id":382,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/534141QQ%E5%9B%BE%E7%89%8720151118110506.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/510229%E8%8B%8F%E5%AE%81%E6%98%93%E8%B4%AD.jpg"},{"site":"waimai.baidu.com","name":"百度外卖","ename":"baiduwaimai","mall_id":17403,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/5241181%E7%99%BE%E5%BA%A6%E5%A4%96%E5%8D%96logo.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/857646%E7%99%BE%E5%BA%A6%E5%A4%96%E5%8D%96.jpg"}],"guid_category":[],"hot_youhui":[{"article_id":0,"banner_title":"精选","banner_pic":"","banner_order":0,"sub_type":"detail","sub_value":"","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636098918411292969","banner_params":"{\"youhuitype\":\"1001\",\"sort\":\"15\",\"channelrankindex\":\"10\"}"},{"article_id":0,"banner_title":"网购","banner_pic":"","banner_order":0,"sub_type":"detail","sub_value":"","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636125773934629845","banner_params":"{\"youhuitype\":\"100101\",\"sort\":\"1\",\"channelrankindex\":\"1\",\"storetype\":\"-1\"}"},{"article_id":0,"banner_title":"打车租车","banner_pic":"","banner_order":0,"sub_type":"detail","sub_value":"","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636092906892396485","banner_params":"{\"youhuitype\":\"10010201\",\"sort\":\"1\",\"channelrankindex\":\"1\"}"},{"article_id":0,"banner_title":"外卖","banner_pic":"","banner_order":0,"sub_type":"detail","sub_value":"","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636092906962669923","banner_params":"{\"youhuitype\":\"10010202\",\"sort\":\"1\",\"channelrankindex\":\"1\"}"},{"article_id":0,"banner_title":"电影票","banner_pic":"","banner_order":0,"sub_type":"detail","sub_value":"","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636092907024281251","banner_params":"{\"youhuitype\":\"10010203\",\"channelrankindex\":\"1\",\"sort\":\"1\"}"},{"article_id":0,"banner_title":"旅游酒店","banner_pic":"","banner_order":0,"sub_type":"detail","sub_value":"","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636092907135921876","banner_params":"{\"youhuitype\":\"10010204\",\"sort\":\"1\",\"channelrankindex\":\"1\"}"}],"welfare_bulletin":[],"section2":[{"article_id":0,"banner_title":"滴滴优惠券","banner_pic":"http://image3.juanlaoda.com/AdminImageUpload/211630APPbn5gn2.png","banner_order":0,"sub_type":"site","sub_value":"xiaojukeji.com","sub_name":"滴滴打车","banner_url":"","banner_vicetitle":"","banner_version":"636159498211700559","banner_params":"{\"site\":\"xiaojukeji.com\"}"},{"article_id":0,"banner_title":"Uber优惠券","banner_pic":"http://image3.juanlaoda.com/AdminImageUpload/39272APPbn5gn4.png","banner_order":0,"sub_type":"site","sub_value":"uber.com","sub_name":"Uber","banner_url":"","banner_vicetitle":"","banner_version":"636159498316587399","banner_params":"{\"site\":\"uber.com\"}"},{"article_id":0,"banner_title":"外卖红包","banner_pic":"http://image2.juanlaoda.com/AdminImageUpload/251441APPbn5gn3-wm.png","banner_order":0,"sub_type":"category","sub_value":"5391","sub_name":"外卖红包","banner_url":"","banner_vicetitle":"","banner_version":"636159498558784199","banner_params":"{\"category\":\"5391\"}"},{"article_id":0,"banner_title":"电影","banner_pic":"http://image2.juanlaoda.com/AdminImageUpload/921841APPbn5gn5.png","banner_order":0,"sub_type":"category","sub_value":"1187","sub_name":"电影优惠券","banner_url":"","banner_vicetitle":"","banner_version":"636159498452735205","banner_params":"{\"sort\":\"15\",\"category\":\"1187\"}"}]}
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
        private List<RowsBean> rows;
        private List<HotMallsBean> hot_malls;
        private List<HotYouhuiBean> hot_youhui;
        private List<Section2Bean> section2;

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public List<HotMallsBean> getHot_malls() {
            return hot_malls;
        }

        public void setHot_malls(List<HotMallsBean> hot_malls) {
            this.hot_malls = hot_malls;
        }

        public List<HotYouhuiBean> getHot_youhui() {
            return hot_youhui;
        }

        public void setHot_youhui(List<HotYouhuiBean> hot_youhui) {
            this.hot_youhui = hot_youhui;
        }

        public List<Section2Bean> getSection2() {
            return section2;
        }

        public void setSection2(List<Section2Bean> section2) {
            this.section2 = section2;
        }

        public static class RowsBean {
            /**
             * article_id : 0
             * banner_title : 2017新春红包
             * banner_pic : http://image2.quanmama.com/AdminImageUpload/3269893256.jpg
             * banner_order : 0
             * sub_type : detail
             * sub_value : 1879599
             * sub_name :
             * banner_url :
             * banner_vicetitle :
             * banner_version : 636186187613160684
             * banner_params : {}
             */

            private int article_id;
            private String banner_title;
            private String banner_pic;
            private int banner_order;
            private String sub_type;
            private String sub_value;
            private String sub_name;
            private String banner_url;
            private String banner_vicetitle;
            private String banner_version;
            private String banner_params;

            public int getArticle_id() {
                return article_id;
            }

            public void setArticle_id(int article_id) {
                this.article_id = article_id;
            }

            public String getBanner_title() {
                return banner_title;
            }

            public void setBanner_title(String banner_title) {
                this.banner_title = banner_title;
            }

            public String getBanner_pic() {
                return banner_pic;
            }

            public void setBanner_pic(String banner_pic) {
                this.banner_pic = banner_pic;
            }

            public int getBanner_order() {
                return banner_order;
            }

            public void setBanner_order(int banner_order) {
                this.banner_order = banner_order;
            }

            public String getSub_type() {
                return sub_type;
            }

            public void setSub_type(String sub_type) {
                this.sub_type = sub_type;
            }

            public String getSub_value() {
                return sub_value;
            }

            public void setSub_value(String sub_value) {
                this.sub_value = sub_value;
            }

            public String getSub_name() {
                return sub_name;
            }

            public void setSub_name(String sub_name) {
                this.sub_name = sub_name;
            }

            public String getBanner_url() {
                return banner_url;
            }

            public void setBanner_url(String banner_url) {
                this.banner_url = banner_url;
            }

            public String getBanner_vicetitle() {
                return banner_vicetitle;
            }

            public void setBanner_vicetitle(String banner_vicetitle) {
                this.banner_vicetitle = banner_vicetitle;
            }

            public String getBanner_version() {
                return banner_version;
            }

            public void setBanner_version(String banner_version) {
                this.banner_version = banner_version;
            }

            public String getBanner_params() {
                return banner_params;
            }

            public void setBanner_params(String banner_params) {
                this.banner_params = banner_params;
            }
        }

        public static class HotMallsBean {
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

        public static class HotYouhuiBean {
            /**
             * article_id : 0
             * banner_title : 精选
             * banner_pic :
             * banner_order : 0
             * sub_type : detail
             * sub_value :
             * sub_name :
             * banner_url :
             * banner_vicetitle :
             * banner_version : 636098918411292969
             * banner_params : {"youhuitype":"1001","sort":"15","channelrankindex":"10"}
             */

            private int article_id;
            private String banner_title;
            private String banner_pic;
            private int banner_order;
            private String sub_type;
            private String sub_value;
            private String sub_name;
            private String banner_url;
            private String banner_vicetitle;
            private String banner_version;
            private String banner_params;

            public int getArticle_id() {
                return article_id;
            }

            public void setArticle_id(int article_id) {
                this.article_id = article_id;
            }

            public String getBanner_title() {
                return banner_title;
            }

            public void setBanner_title(String banner_title) {
                this.banner_title = banner_title;
            }

            public String getBanner_pic() {
                return banner_pic;
            }

            public void setBanner_pic(String banner_pic) {
                this.banner_pic = banner_pic;
            }

            public int getBanner_order() {
                return banner_order;
            }

            public void setBanner_order(int banner_order) {
                this.banner_order = banner_order;
            }

            public String getSub_type() {
                return sub_type;
            }

            public void setSub_type(String sub_type) {
                this.sub_type = sub_type;
            }

            public String getSub_value() {
                return sub_value;
            }

            public void setSub_value(String sub_value) {
                this.sub_value = sub_value;
            }

            public String getSub_name() {
                return sub_name;
            }

            public void setSub_name(String sub_name) {
                this.sub_name = sub_name;
            }

            public String getBanner_url() {
                return banner_url;
            }

            public void setBanner_url(String banner_url) {
                this.banner_url = banner_url;
            }

            public String getBanner_vicetitle() {
                return banner_vicetitle;
            }

            public void setBanner_vicetitle(String banner_vicetitle) {
                this.banner_vicetitle = banner_vicetitle;
            }

            public String getBanner_version() {
                return banner_version;
            }

            public void setBanner_version(String banner_version) {
                this.banner_version = banner_version;
            }

            public String getBanner_params() {
                return banner_params;
            }

            public void setBanner_params(String banner_params) {
                this.banner_params = banner_params;
            }
        }

        public static class Section2Bean {
            /**
             * article_id : 0
             * banner_title : 滴滴优惠券
             * banner_pic : http://image3.juanlaoda.com/AdminImageUpload/211630APPbn5gn2.png
             * banner_order : 0
             * sub_type : site
             * sub_value : xiaojukeji.com
             * sub_name : 滴滴打车
             * banner_url :
             * banner_vicetitle :
             * banner_version : 636159498211700559
             * banner_params : {"site":"xiaojukeji.com"}
             */

            private int article_id;
            private String banner_title;
            private String banner_pic;
            private int banner_order;
            private String sub_type;
            private String sub_value;
            private String sub_name;
            private String banner_url;
            private String banner_vicetitle;
            private String banner_version;
            private String banner_params;

            public int getArticle_id() {
                return article_id;
            }

            public void setArticle_id(int article_id) {
                this.article_id = article_id;
            }

            public String getBanner_title() {
                return banner_title;
            }

            public void setBanner_title(String banner_title) {
                this.banner_title = banner_title;
            }

            public String getBanner_pic() {
                return banner_pic;
            }

            public void setBanner_pic(String banner_pic) {
                this.banner_pic = banner_pic;
            }

            public int getBanner_order() {
                return banner_order;
            }

            public void setBanner_order(int banner_order) {
                this.banner_order = banner_order;
            }

            public String getSub_type() {
                return sub_type;
            }

            public void setSub_type(String sub_type) {
                this.sub_type = sub_type;
            }

            public String getSub_value() {
                return sub_value;
            }

            public void setSub_value(String sub_value) {
                this.sub_value = sub_value;
            }

            public String getSub_name() {
                return sub_name;
            }

            public void setSub_name(String sub_name) {
                this.sub_name = sub_name;
            }

            public String getBanner_url() {
                return banner_url;
            }

            public void setBanner_url(String banner_url) {
                this.banner_url = banner_url;
            }

            public String getBanner_vicetitle() {
                return banner_vicetitle;
            }

            public void setBanner_vicetitle(String banner_vicetitle) {
                this.banner_vicetitle = banner_vicetitle;
            }

            public String getBanner_version() {
                return banner_version;
            }

            public void setBanner_version(String banner_version) {
                this.banner_version = banner_version;
            }

            public String getBanner_params() {
                return banner_params;
            }

            public void setBanner_params(String banner_params) {
                this.banner_params = banner_params;
            }
        }
    }
}
