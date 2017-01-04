package bean;

import java.util.List;

/**
 * Created by Administrator on 2016/12/31.
 */

public class BrandDetailBean  {

    /**
     * error_code : 0
     * error_msg :
     * data : {"storeinfo":{"site":"beibei.com","name":"贝贝网","ename":"beibeiwang","mall_id":17376,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/593464%E8%B4%9D%E8%B4%9D.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/1222693%E8%B4%9D%E8%B4%9D.jpg"},"postlist":[{"youhuitype":10,"youhuitypename":"优惠券","items":[{"article_id":1872436,"article_mall":"贝贝网","article_mall_icon":"http://image3.juanlaoda.com/AdminImageUpload/593464贝贝.png","article_mall_icon2":"http://image1.juanlaoda.com/AdminImageUpload/3846908bb.png","article_site":"beibei.com","article_pic":"http://image1.juanlaoda.com/AdminImageUpload/157493beibei.png","article_worthy":0,"article_unworthy":0,"article_format_date":"12-21 12:14","article_title":"贝贝网年货节","article_vicetitle":"满300送288元","article_comment":0,"article_link_type":"优惠券","article_link_type_value":"3","article_link":"http://www.quanmama.com:8000/t/goto.aspx?union=smzdm&tag=zdm1872436&url=http://www.beibei.com/","article_couponout_url":"http://www.quanmama.com:8000/t/quanout.aspx?sysno=1872436","article_status":101,"article_referrals":"券妈妈小编","article_usedcount":0,"article_remaincount":1,"article_begintime":"2016-12-21","article_endtime":"2016-12-31","article_is_timeout":0,"article_coupontype":1,"article_fav_count":0,"article_read_count":2071,"article_youhuitype1":10,"article_youhuitype2":1001,"article_youhuitype3":100101,"article_youhuitype4":0,"article_category":"网购","article_has_verifycode":0,"article_simpletitle":"贝贝网年货节","article_tag":"","article_price":"￥0.00","article_buyFee":"￥0.00","article_oldPrice":"","appcellredirecttype":0},{"article_id":1726767,"article_mall":"贝贝网","article_mall_icon":"http://image3.juanlaoda.com/AdminImageUpload/593464贝贝.png","article_mall_icon2":"http://image1.juanlaoda.com/AdminImageUpload/3846908bb.png","article_site":"beibei.com","article_pic":"http://image2.quanmama.com/AdminImageUpload/522903贝贝网60元红包 190.png","article_worthy":0,"article_unworthy":0,"article_format_date":"09-19 09:00","article_title":"贝贝网新人专享60元红包","article_vicetitle":"APP注册领取","article_comment":0,"article_link_type":"优惠券","article_link_type_value":"3","article_link":"http://m.beibei.com?from=quanmama","article_couponout_url":"http://www.quanmama.com:8000/t/quanout.aspx?sysno=1726767","article_status":101,"article_referrals":"券妈妈小编","article_usedcount":0,"article_remaincount":1,"article_begintime":"2016-09-19","article_endtime":"2017-01-31","article_is_timeout":0,"article_coupontype":1,"article_fav_count":2,"article_read_count":6034,"article_youhuitype1":10,"article_youhuitype2":1001,"article_youhuitype3":0,"article_youhuitype4":0,"article_category":"国内优惠券","article_has_verifycode":0,"article_simpletitle":"贝贝网新人专享60元红包","article_tag":"","article_price":"￥0.00","article_buyFee":"￥0.00","article_oldPrice":"","appcellredirecttype":0}]}]}
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
         * storeinfo : {"site":"beibei.com","name":"贝贝网","ename":"beibeiwang","mall_id":17376,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/593464%E8%B4%9D%E8%B4%9D.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/1222693%E8%B4%9D%E8%B4%9D.jpg"}
         * postlist : [{"youhuitype":10,"youhuitypename":"优惠券","items":[{"article_id":1872436,"article_mall":"贝贝网","article_mall_icon":"http://image3.juanlaoda.com/AdminImageUpload/593464贝贝.png","article_mall_icon2":"http://image1.juanlaoda.com/AdminImageUpload/3846908bb.png","article_site":"beibei.com","article_pic":"http://image1.juanlaoda.com/AdminImageUpload/157493beibei.png","article_worthy":0,"article_unworthy":0,"article_format_date":"12-21 12:14","article_title":"贝贝网年货节","article_vicetitle":"满300送288元","article_comment":0,"article_link_type":"优惠券","article_link_type_value":"3","article_link":"http://www.quanmama.com:8000/t/goto.aspx?union=smzdm&tag=zdm1872436&url=http://www.beibei.com/","article_couponout_url":"http://www.quanmama.com:8000/t/quanout.aspx?sysno=1872436","article_status":101,"article_referrals":"券妈妈小编","article_usedcount":0,"article_remaincount":1,"article_begintime":"2016-12-21","article_endtime":"2016-12-31","article_is_timeout":0,"article_coupontype":1,"article_fav_count":0,"article_read_count":2071,"article_youhuitype1":10,"article_youhuitype2":1001,"article_youhuitype3":100101,"article_youhuitype4":0,"article_category":"网购","article_has_verifycode":0,"article_simpletitle":"贝贝网年货节","article_tag":"","article_price":"￥0.00","article_buyFee":"￥0.00","article_oldPrice":"","appcellredirecttype":0},{"article_id":1726767,"article_mall":"贝贝网","article_mall_icon":"http://image3.juanlaoda.com/AdminImageUpload/593464贝贝.png","article_mall_icon2":"http://image1.juanlaoda.com/AdminImageUpload/3846908bb.png","article_site":"beibei.com","article_pic":"http://image2.quanmama.com/AdminImageUpload/522903贝贝网60元红包 190.png","article_worthy":0,"article_unworthy":0,"article_format_date":"09-19 09:00","article_title":"贝贝网新人专享60元红包","article_vicetitle":"APP注册领取","article_comment":0,"article_link_type":"优惠券","article_link_type_value":"3","article_link":"http://m.beibei.com?from=quanmama","article_couponout_url":"http://www.quanmama.com:8000/t/quanout.aspx?sysno=1726767","article_status":101,"article_referrals":"券妈妈小编","article_usedcount":0,"article_remaincount":1,"article_begintime":"2016-09-19","article_endtime":"2017-01-31","article_is_timeout":0,"article_coupontype":1,"article_fav_count":2,"article_read_count":6034,"article_youhuitype1":10,"article_youhuitype2":1001,"article_youhuitype3":0,"article_youhuitype4":0,"article_category":"国内优惠券","article_has_verifycode":0,"article_simpletitle":"贝贝网新人专享60元红包","article_tag":"","article_price":"￥0.00","article_buyFee":"￥0.00","article_oldPrice":"","appcellredirecttype":0}]}]
         */

        private StoreinfoBean storeinfo;
        private List<PostlistBean> postlist;

        public StoreinfoBean getStoreinfo() {
            return storeinfo;
        }

        public void setStoreinfo(StoreinfoBean storeinfo) {
            this.storeinfo = storeinfo;
        }

        public List<PostlistBean> getPostlist() {
            return postlist;
        }

        public void setPostlist(List<PostlistBean> postlist) {
            this.postlist = postlist;
        }

        public static class StoreinfoBean {
            /**
             * site : beibei.com
             * name : 贝贝网
             * ename : beibeiwang
             * mall_id : 17376
             * summary :
             * detail_info :
             * img : http://image3.juanlaoda.com/AdminImageUpload/593464%E8%B4%9D%E8%B4%9D.png
             * img_w : 0
             * img_h : 0
             * isKfc : 0
             * show_logo_img : 0
             * background_img : http://image3.juanlaoda.com/AdminImageUpload/1222693%E8%B4%9D%E8%B4%9D.jpg
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

        public static class PostlistBean {
            /**
             * youhuitype : 10
             * youhuitypename : 优惠券
             * items : [{"article_id":1872436,"article_mall":"贝贝网","article_mall_icon":"http://image3.juanlaoda.com/AdminImageUpload/593464贝贝.png","article_mall_icon2":"http://image1.juanlaoda.com/AdminImageUpload/3846908bb.png","article_site":"beibei.com","article_pic":"http://image1.juanlaoda.com/AdminImageUpload/157493beibei.png","article_worthy":0,"article_unworthy":0,"article_format_date":"12-21 12:14","article_title":"贝贝网年货节","article_vicetitle":"满300送288元","article_comment":0,"article_link_type":"优惠券","article_link_type_value":"3","article_link":"http://www.quanmama.com:8000/t/goto.aspx?union=smzdm&tag=zdm1872436&url=http://www.beibei.com/","article_couponout_url":"http://www.quanmama.com:8000/t/quanout.aspx?sysno=1872436","article_status":101,"article_referrals":"券妈妈小编","article_usedcount":0,"article_remaincount":1,"article_begintime":"2016-12-21","article_endtime":"2016-12-31","article_is_timeout":0,"article_coupontype":1,"article_fav_count":0,"article_read_count":2071,"article_youhuitype1":10,"article_youhuitype2":1001,"article_youhuitype3":100101,"article_youhuitype4":0,"article_category":"网购","article_has_verifycode":0,"article_simpletitle":"贝贝网年货节","article_tag":"","article_price":"￥0.00","article_buyFee":"￥0.00","article_oldPrice":"","appcellredirecttype":0},{"article_id":1726767,"article_mall":"贝贝网","article_mall_icon":"http://image3.juanlaoda.com/AdminImageUpload/593464贝贝.png","article_mall_icon2":"http://image1.juanlaoda.com/AdminImageUpload/3846908bb.png","article_site":"beibei.com","article_pic":"http://image2.quanmama.com/AdminImageUpload/522903贝贝网60元红包 190.png","article_worthy":0,"article_unworthy":0,"article_format_date":"09-19 09:00","article_title":"贝贝网新人专享60元红包","article_vicetitle":"APP注册领取","article_comment":0,"article_link_type":"优惠券","article_link_type_value":"3","article_link":"http://m.beibei.com?from=quanmama","article_couponout_url":"http://www.quanmama.com:8000/t/quanout.aspx?sysno=1726767","article_status":101,"article_referrals":"券妈妈小编","article_usedcount":0,"article_remaincount":1,"article_begintime":"2016-09-19","article_endtime":"2017-01-31","article_is_timeout":0,"article_coupontype":1,"article_fav_count":2,"article_read_count":6034,"article_youhuitype1":10,"article_youhuitype2":1001,"article_youhuitype3":0,"article_youhuitype4":0,"article_category":"国内优惠券","article_has_verifycode":0,"article_simpletitle":"贝贝网新人专享60元红包","article_tag":"","article_price":"￥0.00","article_buyFee":"￥0.00","article_oldPrice":"","appcellredirecttype":0}]
             */

            private int youhuitype;
            private String youhuitypename;
            private List<ItemsBean> items;

            public int getYouhuitype() {
                return youhuitype;
            }

            public void setYouhuitype(int youhuitype) {
                this.youhuitype = youhuitype;
            }

            public String getYouhuitypename() {
                return youhuitypename;
            }

            public void setYouhuitypename(String youhuitypename) {
                this.youhuitypename = youhuitypename;
            }

            public List<ItemsBean> getItems() {
                return items;
            }

            public void setItems(List<ItemsBean> items) {
                this.items = items;
            }

            public static class ItemsBean {
                /**
                 * article_id : 1872436
                 * article_mall : 贝贝网
                 * article_mall_icon : http://image3.juanlaoda.com/AdminImageUpload/593464贝贝.png
                 * article_mall_icon2 : http://image1.juanlaoda.com/AdminImageUpload/3846908bb.png
                 * article_site : beibei.com
                 * article_pic : http://image1.juanlaoda.com/AdminImageUpload/157493beibei.png
                 * article_worthy : 0
                 * article_unworthy : 0
                 * article_format_date : 12-21 12:14
                 * article_title : 贝贝网年货节
                 * article_vicetitle : 满300送288元
                 * article_comment : 0
                 * article_link_type : 优惠券
                 * article_link_type_value : 3
                 * article_link : http://www.quanmama.com:8000/t/goto.aspx?union=smzdm&tag=zdm1872436&url=http://www.beibei.com/
                 * article_couponout_url : http://www.quanmama.com:8000/t/quanout.aspx?sysno=1872436
                 * article_status : 101
                 * article_referrals : 券妈妈小编
                 * article_usedcount : 0
                 * article_remaincount : 1
                 * article_begintime : 2016-12-21
                 * article_endtime : 2016-12-31
                 * article_is_timeout : 0
                 * article_coupontype : 1
                 * article_fav_count : 0
                 * article_read_count : 2071
                 * article_youhuitype1 : 10
                 * article_youhuitype2 : 1001
                 * article_youhuitype3 : 100101
                 * article_youhuitype4 : 0
                 * article_category : 网购
                 * article_has_verifycode : 0
                 * article_simpletitle : 贝贝网年货节
                 * article_tag :
                 * article_price : ￥0.00
                 * article_buyFee : ￥0.00
                 * article_oldPrice :
                 * appcellredirecttype : 0
                 */

                private int article_id;
                private String article_mall;
                private String article_mall_icon;
                private String article_mall_icon2;
                private String article_site;
                private String article_pic;
                private int article_worthy;
                private int article_unworthy;
                private String article_format_date;
                private String article_title;
                private String article_vicetitle;
                private int article_comment;
                private String article_link_type;
                private String article_link_type_value;
                private String article_link;
                private String article_couponout_url;
                private int article_status;
                private String article_referrals;
                private int article_usedcount;
                private int article_remaincount;
                private String article_begintime;
                private String article_endtime;
                private int article_is_timeout;
                private int article_coupontype;
                private int article_fav_count;
                private int article_read_count;
                private int article_youhuitype1;
                private int article_youhuitype2;
                private int article_youhuitype3;
                private int article_youhuitype4;
                private String article_category;
                private int article_has_verifycode;
                private String article_simpletitle;
                private String article_tag;
                private String article_price;
                private String article_buyFee;
                private String article_oldPrice;
                private int appcellredirecttype;

                public int getArticle_id() {
                    return article_id;
                }

                public void setArticle_id(int article_id) {
                    this.article_id = article_id;
                }

                public String getArticle_mall() {
                    return article_mall;
                }

                public void setArticle_mall(String article_mall) {
                    this.article_mall = article_mall;
                }

                public String getArticle_mall_icon() {
                    return article_mall_icon;
                }

                public void setArticle_mall_icon(String article_mall_icon) {
                    this.article_mall_icon = article_mall_icon;
                }

                public String getArticle_mall_icon2() {
                    return article_mall_icon2;
                }

                public void setArticle_mall_icon2(String article_mall_icon2) {
                    this.article_mall_icon2 = article_mall_icon2;
                }

                public String getArticle_site() {
                    return article_site;
                }

                public void setArticle_site(String article_site) {
                    this.article_site = article_site;
                }

                public String getArticle_pic() {
                    return article_pic;
                }

                public void setArticle_pic(String article_pic) {
                    this.article_pic = article_pic;
                }

                public int getArticle_worthy() {
                    return article_worthy;
                }

                public void setArticle_worthy(int article_worthy) {
                    this.article_worthy = article_worthy;
                }

                public int getArticle_unworthy() {
                    return article_unworthy;
                }

                public void setArticle_unworthy(int article_unworthy) {
                    this.article_unworthy = article_unworthy;
                }

                public String getArticle_format_date() {
                    return article_format_date;
                }

                public void setArticle_format_date(String article_format_date) {
                    this.article_format_date = article_format_date;
                }

                public String getArticle_title() {
                    return article_title;
                }

                public void setArticle_title(String article_title) {
                    this.article_title = article_title;
                }

                public String getArticle_vicetitle() {
                    return article_vicetitle;
                }

                public void setArticle_vicetitle(String article_vicetitle) {
                    this.article_vicetitle = article_vicetitle;
                }

                public int getArticle_comment() {
                    return article_comment;
                }

                public void setArticle_comment(int article_comment) {
                    this.article_comment = article_comment;
                }

                public String getArticle_link_type() {
                    return article_link_type;
                }

                public void setArticle_link_type(String article_link_type) {
                    this.article_link_type = article_link_type;
                }

                public String getArticle_link_type_value() {
                    return article_link_type_value;
                }

                public void setArticle_link_type_value(String article_link_type_value) {
                    this.article_link_type_value = article_link_type_value;
                }

                public String getArticle_link() {
                    return article_link;
                }

                public void setArticle_link(String article_link) {
                    this.article_link = article_link;
                }

                public String getArticle_couponout_url() {
                    return article_couponout_url;
                }

                public void setArticle_couponout_url(String article_couponout_url) {
                    this.article_couponout_url = article_couponout_url;
                }

                public int getArticle_status() {
                    return article_status;
                }

                public void setArticle_status(int article_status) {
                    this.article_status = article_status;
                }

                public String getArticle_referrals() {
                    return article_referrals;
                }

                public void setArticle_referrals(String article_referrals) {
                    this.article_referrals = article_referrals;
                }

                public int getArticle_usedcount() {
                    return article_usedcount;
                }

                public void setArticle_usedcount(int article_usedcount) {
                    this.article_usedcount = article_usedcount;
                }

                public int getArticle_remaincount() {
                    return article_remaincount;
                }

                public void setArticle_remaincount(int article_remaincount) {
                    this.article_remaincount = article_remaincount;
                }

                public String getArticle_begintime() {
                    return article_begintime;
                }

                public void setArticle_begintime(String article_begintime) {
                    this.article_begintime = article_begintime;
                }

                public String getArticle_endtime() {
                    return article_endtime;
                }

                public void setArticle_endtime(String article_endtime) {
                    this.article_endtime = article_endtime;
                }

                public int getArticle_is_timeout() {
                    return article_is_timeout;
                }

                public void setArticle_is_timeout(int article_is_timeout) {
                    this.article_is_timeout = article_is_timeout;
                }

                public int getArticle_coupontype() {
                    return article_coupontype;
                }

                public void setArticle_coupontype(int article_coupontype) {
                    this.article_coupontype = article_coupontype;
                }

                public int getArticle_fav_count() {
                    return article_fav_count;
                }

                public void setArticle_fav_count(int article_fav_count) {
                    this.article_fav_count = article_fav_count;
                }

                public int getArticle_read_count() {
                    return article_read_count;
                }

                public void setArticle_read_count(int article_read_count) {
                    this.article_read_count = article_read_count;
                }

                public int getArticle_youhuitype1() {
                    return article_youhuitype1;
                }

                public void setArticle_youhuitype1(int article_youhuitype1) {
                    this.article_youhuitype1 = article_youhuitype1;
                }

                public int getArticle_youhuitype2() {
                    return article_youhuitype2;
                }

                public void setArticle_youhuitype2(int article_youhuitype2) {
                    this.article_youhuitype2 = article_youhuitype2;
                }

                public int getArticle_youhuitype3() {
                    return article_youhuitype3;
                }

                public void setArticle_youhuitype3(int article_youhuitype3) {
                    this.article_youhuitype3 = article_youhuitype3;
                }

                public int getArticle_youhuitype4() {
                    return article_youhuitype4;
                }

                public void setArticle_youhuitype4(int article_youhuitype4) {
                    this.article_youhuitype4 = article_youhuitype4;
                }

                public String getArticle_category() {
                    return article_category;
                }

                public void setArticle_category(String article_category) {
                    this.article_category = article_category;
                }

                public int getArticle_has_verifycode() {
                    return article_has_verifycode;
                }

                public void setArticle_has_verifycode(int article_has_verifycode) {
                    this.article_has_verifycode = article_has_verifycode;
                }

                public String getArticle_simpletitle() {
                    return article_simpletitle;
                }

                public void setArticle_simpletitle(String article_simpletitle) {
                    this.article_simpletitle = article_simpletitle;
                }

                public String getArticle_tag() {
                    return article_tag;
                }

                public void setArticle_tag(String article_tag) {
                    this.article_tag = article_tag;
                }

                public String getArticle_price() {
                    return article_price;
                }

                public void setArticle_price(String article_price) {
                    this.article_price = article_price;
                }

                public String getArticle_buyFee() {
                    return article_buyFee;
                }

                public void setArticle_buyFee(String article_buyFee) {
                    this.article_buyFee = article_buyFee;
                }

                public String getArticle_oldPrice() {
                    return article_oldPrice;
                }

                public void setArticle_oldPrice(String article_oldPrice) {
                    this.article_oldPrice = article_oldPrice;
                }

                public int getAppcellredirecttype() {
                    return appcellredirecttype;
                }

                public void setAppcellredirecttype(int appcellredirecttype) {
                    this.appcellredirecttype = appcellredirecttype;
                }
            }
        }
    }
}
