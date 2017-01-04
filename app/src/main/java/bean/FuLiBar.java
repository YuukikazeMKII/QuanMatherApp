package bean;

import java.util.List;

/**
 * Created by Administrator on 2016/12/31.
 */

public class FuLiBar {

    /**
     * error_code : 0
     * error_msg :
     * data : {"rows":[{"article_id":0,"banner_title":"精选","banner_pic":"","banner_order":0,"sub_type":"detail","sub_value":"","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636098842248490235","banner_params":"{\"youhuitype\":\"12\",\"sort\":\"15\",\"channelrankindex\":\"10\"}"},{"article_id":0,"banner_title":"流量话费","banner_pic":"","banner_order":0,"sub_type":"detail","sub_value":"","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636072200235628907","banner_params":"{\"youhuitype\":\"1201\",\"sort\":\"1\",\"channelrankindex\":\"1\"}"},{"article_id":0,"banner_title":"影音会员","banner_pic":"","banner_order":0,"sub_type":"detail","sub_value":"","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636072200290970704","banner_params":"{\"youhuitype\":\"1206\",\"sort\":\"1\",\"channelrankindex\":\"1\"}"},{"article_id":0,"banner_title":"电影票","banner_pic":"","banner_order":0,"sub_type":"detail","sub_value":"","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636072200342953126","banner_params":"{\"youhuitype\":\"1205\",\"sort\":\"1\",\"channelrankindex\":\"1\"}"},{"article_id":0,"banner_title":"抢红包","banner_pic":"","banner_order":0,"sub_type":"detail","sub_value":"","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636072200119144532","banner_params":"{\"youhuitype\":\"1202\",\"sort\":\"1\",\"channelrankindex\":\"1\"}"},{"article_id":0,"banner_title":"购物","banner_pic":"","banner_order":0,"sub_type":"detail","sub_value":"","sub_name":"购物","banner_url":"","banner_vicetitle":"","banner_version":"636072200068587891","banner_params":"{\"youhuitype\":\"1203\",\"sort\":\"1\",\"channelrankindex\":\"1\"}"},{"article_id":0,"banner_title":"金融理财","banner_pic":"","banner_order":0,"sub_type":"detail","sub_value":"","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636072200015746094","banner_params":"{\"youhuitype\":\"1204\",\"sort\":\"1\",\"channelrankindex\":\"1\"}"},{"article_id":0,"banner_title":"旅游酒店","banner_pic":"","banner_order":0,"sub_type":"detail","sub_value":"","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636072199955677735","banner_params":"{\"youhuitype\":\"1207\",\"sort\":\"1\",\"channelrankindex\":\"1\"}"},{"article_id":0,"banner_title":"生活服务","banner_pic":"","banner_order":0,"sub_type":"detail","sub_value":"","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636072199904105469","banner_params":"{\"youhuitype\":\"1208\",\"sort\":\"1\",\"channelrankindex\":\"1\"}"},{"article_id":0,"banner_title":"爱车养车","banner_pic":"","banner_order":0,"sub_type":"detail","sub_value":"","sub_name":"","banner_url":"","banner_vicetitle":"","banner_version":"636072199842240235","banner_params":"{\"youhuitype\":\"1210\",\"sort\":\"1\",\"channelrankindex\":\"1\"}"}]}
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

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public static class RowsBean {
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
             * banner_version : 636098842248490235
             * banner_params : {"youhuitype":"12","sort":"15","channelrankindex":"10"}
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
