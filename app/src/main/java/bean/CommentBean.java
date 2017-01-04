package bean;

import java.util.List;

/**
 * Created by Administrator on 2016/12/29.
 */

public class CommentBean {
    /**
     * error_code : 0
     * error_msg :
     * data : {"rows":[{"comment_id":30087,"comment_parentid":0,"head":"http://www.quanmama.com:8000/images/userhead/14.jpg","floor":"4楼","comment_content":"春运能抢到票酒不错了，谁还会在乎优惠个几块钱，还是建议券妈妈开发个快速抢票系统，这样比较完美","comment_date":"2016-12-29 09:28:30","format_date_client":"9小时前","comment_author":"1738爱妃","comment_authoremail":"5580388D86139C437FB1B494B8B8F38F@qq.cn","readstatus":"0","post_title":"","post_content":"","article_id":"1875384","support_count":"1","oppose_count":"0","ding_class":"","parent_data":[]},{"comment_id":30076,"comment_parentid":0,"head":"http://www.quanmama.com:8000/images/userhead/25.jpg","floor":"板凳","comment_content":"[吐舌][吐舌]","comment_date":"2016-12-27 18:12:57","format_date_client":"12-27 18:12","comment_author":"？？？","comment_authoremail":"oEU34suzq6K7F6Po1Akx9u5XR9O8@weixin.cn","readstatus":"0","post_title":"","post_content":"","article_id":"1875384","support_count":"1","oppose_count":"0","ding_class":"","parent_data":[]},{"comment_id":30075,"comment_parentid":0,"head":"http://www.quanmama.com:8000/images/userhead/18.jpg","floor":"椅子","comment_content":"抢到票就不错了 要啥优惠","comment_date":"2016-12-27 14:49:28","format_date_client":"12-27 14:49","comment_author":"刁刁","comment_authoremail":"oEU34snHM7Z-npdxBtuvulJ9c7es@weixin.cn","readstatus":"0","post_title":"","post_content":"","article_id":"1875384","support_count":"2","oppose_count":"0","ding_class":"","parent_data":[]},{"comment_id":30074,"comment_parentid":0,"head":"http://www.quanmama.com:8000/images/userhead/31.jpg","floor":"沙发","comment_content":"有优惠关键买不到票～抢票又不能用这卷","comment_date":"2016-12-27 04:09:29","format_date_client":"12-27 04:09","comment_author":"過","comment_authoremail":"oEU34ssO1XnCg8ZH-XHM_6baNMFU@weixin.cn","readstatus":"0","post_title":"","post_content":"","article_id":"1875384","support_count":"0","oppose_count":"0","ding_class":"","parent_data":[]}]}
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
             * comment_id : 30087
             * comment_parentid : 0
             * head : http://www.quanmama.com:8000/images/userhead/14.jpg
             * floor : 4楼
             * comment_content : 春运能抢到票酒不错了，谁还会在乎优惠个几块钱，还是建议券妈妈开发个快速抢票系统，这样比较完美
             * comment_date : 2016-12-29 09:28:30
             * format_date_client : 9小时前
             * comment_author : 1738爱妃
             * comment_authoremail : 5580388D86139C437FB1B494B8B8F38F@qq.cn
             * readstatus : 0
             * post_title :
             * post_content :
             * article_id : 1875384
             * support_count : 1
             * oppose_count : 0
             * ding_class :
             * parent_data : []
             */

            private int comment_id;
            private int comment_parentid;
            private String head;
            private String floor;
            private String comment_content;
            private String comment_date;
            private String format_date_client;
            private String comment_author;
            private String comment_authoremail;
            private String readstatus;
            private String post_title;
            private String post_content;
            private String article_id;
            private String support_count;
            private String oppose_count;
            private String ding_class;
            private List<?> parent_data;

            public int getComment_id() {
                return comment_id;
            }

            public void setComment_id(int comment_id) {
                this.comment_id = comment_id;
            }

            public int getComment_parentid() {
                return comment_parentid;
            }

            public void setComment_parentid(int comment_parentid) {
                this.comment_parentid = comment_parentid;
            }

            public String getHead() {
                return head;
            }

            public void setHead(String head) {
                this.head = head;
            }

            public String getFloor() {
                return floor;
            }

            public void setFloor(String floor) {
                this.floor = floor;
            }

            public String getComment_content() {
                return comment_content;
            }

            public void setComment_content(String comment_content) {
                this.comment_content = comment_content;
            }

            public String getComment_date() {
                return comment_date;
            }

            public void setComment_date(String comment_date) {
                this.comment_date = comment_date;
            }

            public String getFormat_date_client() {
                return format_date_client;
            }

            public void setFormat_date_client(String format_date_client) {
                this.format_date_client = format_date_client;
            }

            public String getComment_author() {
                return comment_author;
            }

            public void setComment_author(String comment_author) {
                this.comment_author = comment_author;
            }

            public String getComment_authoremail() {
                return comment_authoremail;
            }

            public void setComment_authoremail(String comment_authoremail) {
                this.comment_authoremail = comment_authoremail;
            }

            public String getReadstatus() {
                return readstatus;
            }

            public void setReadstatus(String readstatus) {
                this.readstatus = readstatus;
            }

            public String getPost_title() {
                return post_title;
            }

            public void setPost_title(String post_title) {
                this.post_title = post_title;
            }

            public String getPost_content() {
                return post_content;
            }

            public void setPost_content(String post_content) {
                this.post_content = post_content;
            }

            public String getArticle_id() {
                return article_id;
            }

            public void setArticle_id(String article_id) {
                this.article_id = article_id;
            }

            public String getSupport_count() {
                return support_count;
            }

            public void setSupport_count(String support_count) {
                this.support_count = support_count;
            }

            public String getOppose_count() {
                return oppose_count;
            }

            public void setOppose_count(String oppose_count) {
                this.oppose_count = oppose_count;
            }

            public String getDing_class() {
                return ding_class;
            }

            public void setDing_class(String ding_class) {
                this.ding_class = ding_class;
            }

            public List<?> getParent_data() {
                return parent_data;
            }

            public void setParent_data(List<?> parent_data) {
                this.parent_data = parent_data;
            }
        }
    }
}
