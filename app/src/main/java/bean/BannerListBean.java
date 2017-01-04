package bean;

import java.util.List;

/**
 * Created by Administrator on 2016/12/30.
 */

public class BannerListBean {
    /**
     * error_code : 0
     * error_msg :
     * data : {"rows":[],"little_banner":[],"hot_malls":[{"site":"ele.me","name":"饿了么","ename":"eleme","mall_id":19130,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/3850219eleme.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/308518%E9%A5%BF%E4%BA%86%E4%B9%88.jpg"},{"site":"waimai.meituan.com","name":"美团外卖","ename":"meituanwaimai","mall_id":17476,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/3122745%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E7%BE%8E%E5%9B%A2%E5%A4%96%E5%8D%96_20151113.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/732270%E7%BE%8E%E5%9B%A2%E5%A4%96%E5%8D%96.jpg"},{"site":"waimai.baidu.com","name":"百度外卖","ename":"baiduwaimai","mall_id":17403,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/5241181%E7%99%BE%E5%BA%A6%E5%A4%96%E5%8D%96logo.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/857646%E7%99%BE%E5%BA%A6%E5%A4%96%E5%8D%96.jpg"},{"site":"pailequ.cn","name":"派乐趣","ename":"palequ","mall_id":20532,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/55151730.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"daojia.com.cn","name":"到家美食会","ename":"daogumeishihui","mall_id":19272,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/33174750.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"t.dianping.com","name":"大众点评团","ename":"dazhongdianpingtuan","mall_id":679,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/1658643%E5%A4%A7%E4%BC%97%E7%82%B9%E8%AF%84.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"koubei.com","name":"口碑网","ename":"koubeiwang","mall_id":20208,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/13519070.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"dianwoba.com","name":"点我吧","ename":"dianwoba","mall_id":19593,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/35464201.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"}],"guid_category":[],"hot_youhui":[],"welfare_bulletin":[]}
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
        private List<?> rows;
        private List<?> little_banner;
        private List<HotMallsBean> hot_malls;
        private List<?> guid_category;
        private List<?> hot_youhui;
        private List<?> welfare_bulletin;

        public List<?> getRows() {
            return rows;
        }

        public void setRows(List<?> rows) {
            this.rows = rows;
        }

        public List<?> getLittle_banner() {
            return little_banner;
        }

        public void setLittle_banner(List<?> little_banner) {
            this.little_banner = little_banner;
        }

        public List<HotMallsBean> getHot_malls() {
            return hot_malls;
        }

        public void setHot_malls(List<HotMallsBean> hot_malls) {
            this.hot_malls = hot_malls;
        }

        public List<?> getGuid_category() {
            return guid_category;
        }

        public void setGuid_category(List<?> guid_category) {
            this.guid_category = guid_category;
        }

        public List<?> getHot_youhui() {
            return hot_youhui;
        }

        public void setHot_youhui(List<?> hot_youhui) {
            this.hot_youhui = hot_youhui;
        }

        public List<?> getWelfare_bulletin() {
            return welfare_bulletin;
        }

        public void setWelfare_bulletin(List<?> welfare_bulletin) {
            this.welfare_bulletin = welfare_bulletin;
        }

        public static class HotMallsBean {
            /**
             * site : ele.me
             * name : 饿了么
             * ename : eleme
             * mall_id : 19130
             * summary :
             * detail_info :
             * img : http://image3.juanlaoda.com/AdminImageUpload/3850219eleme.png
             * img_w : 0
             * img_h : 0
             * isKfc : 0
             * show_logo_img : 0
             * background_img : http://image2.juanlaoda.com/AdminImageUpload/308518%E9%A5%BF%E4%BA%86%E4%B9%88.jpg
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
}
