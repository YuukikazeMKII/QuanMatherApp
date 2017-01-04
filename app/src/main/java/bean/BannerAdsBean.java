package bean;

import java.util.List;

/**
 * Created by Administrator on 2016/12/31.
 */

public class BannerAdsBean {

    /**
     * error_code : 0
     * error_msg :
     * data : {"rows":[{"article_id":0,"banner_title":"美特斯邦威","banner_pic":"http://image1.quanmama.com/AdminImageUpload/7543861080.png","banner_order":0,"sub_type":"detail","sub_value":"1883270","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636187072878198613","banner_params":"{}"},{"article_id":0,"banner_title":"114MALL","banner_pic":"http://image2.quanmama.com/AdminImageUpload/122582baicai (1).png","banner_order":0,"sub_type":"detail","sub_value":"1874975","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636183654612341605","banner_params":"{}"},{"article_id":0,"banner_title":"网易严选","banner_pic":"http://image3.quanmama.com/AdminImageUpload/950640A12.png","banner_order":0,"sub_type":"detail","sub_value":"1877175","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636187071194637873","banner_params":"{}"}],"little_banner":[],"hot_malls":[],"guid_category":[],"hot_youhui":[],"welfare_bulletin":[]}
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
        private List<?> little_banner;
        private List<?> hot_malls;
        private List<?> guid_category;
        private List<?> hot_youhui;
        private List<?> welfare_bulletin;

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public List<?> getLittle_banner() {
            return little_banner;
        }

        public void setLittle_banner(List<?> little_banner) {
            this.little_banner = little_banner;
        }

        public List<?> getHot_malls() {
            return hot_malls;
        }

        public void setHot_malls(List<?> hot_malls) {
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

        public static class RowsBean {
            /**
             * article_id : 0
             * banner_title : 美特斯邦威
             * banner_pic : http://image1.quanmama.com/AdminImageUpload/7543861080.png
             * banner_order : 0
             * sub_type : detail
             * sub_value : 1883270
             * sub_name :
             * banner_url :
             * banner_vicetitle :
             * banner_version : 636187072878198613
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
    }
}
