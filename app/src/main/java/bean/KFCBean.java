package bean;

import java.util.List;

/**
 * Created by Administrator on 2017/1/3.
 */

public class KFCBean {
    /**
     * error_code : 0
     * error_msg :
     * data : {"rows":[{"site":"kfc","name":"肯德基","ename":"kendeji","mall_id":17190,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/5639468kfc.png","img_w":0,"img_h":0,"isKfc":"1","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/2146405kfc.png"},{"site":"mdl","name":"麦当劳","ename":"maidanglao","mall_id":455,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/593138mdl.png","img_w":0,"img_h":0,"isKfc":"1","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/2930584mc.png"},{"site":"dfjb","name":"东方既白","ename":"dongfangjibai","mall_id":20603,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/ImageUpload/201331020472897.jpg","img_w":0,"img_h":0,"isKfc":"1","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/3125557dfjb.jpg"},{"site":"hanbaowang","name":"汉堡王","ename":"hanbaowang","mall_id":914,"summary":"","detail_info":"","img":"http://image2.quanmama.com/AdminImageUpload/4813748hbw.png","img_w":0,"img_h":0,"isKfc":"1","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/3027556burgerking.png"},{"site":"jiyejia","name":"吉野家","ename":"jiyegu","mall_id":906,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/ImageUpload/20139620233711.jpg","img_w":0,"img_h":0,"isKfc":"1","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/3553192jiyejia.jpg"},{"site":"zhengongfu","name":"真功夫","ename":"zhengongfu","mall_id":452,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/ImageUpload/2013310205634659.jpg","img_w":0,"img_h":0,"isKfc":"1","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/42550zhengongfu.png"},{"site":"yonghedawang","name":"永和大王","ename":"yonghedawang","mall_id":20647,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/ImageUpload/2013211194232.jpg","img_w":0,"img_h":0,"isKfc":"1","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/4140792yonghe.png"},{"site":"dks","name":"德克士","ename":"dekeshi","mall_id":907,"summary":"","detail_info":"","img":"http://www.quanmama.com/AdminImageUpload/5714680dks.png","img_w":0,"img_h":0,"isKfc":"1","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/394965dks.jpg"}]}
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
             * site : kfc
             * name : 肯德基
             * ename : kendeji
             * mall_id : 17190
             * summary :
             * detail_info :
             * img : http://image2.juanlaoda.com/AdminImageUpload/5639468kfc.png
             * img_w : 0
             * img_h : 0
             * isKfc : 1
             * show_logo_img : 0
             * background_img : http://image2.juanlaoda.com/AdminImageUpload/2146405kfc.png
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
