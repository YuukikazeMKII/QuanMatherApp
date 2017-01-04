package utils.paixu;

import java.util.List;

public class SortModel {


	/**
	 * error_code : 0
	 * error_msg :
	 * data : {"hot_malls":[{"site":"jd.com","name":"京东","ename":"jingdong","mall_id":348,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/3022529%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E4%BA%AC%E4%B8%9C_20151113.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/4359453%E4%BA%AC%E4%B8%9C.jpg"},{"site":"vip.com","name":"唯品会","ename":"weipinhui","mall_id":3003,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/450117QQ%E5%9B%BE%E7%89%8720151118110501.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/629165%E5%94%AF%E5%93%81%E4%BC%9A.jpg"},{"site":"yhd.com","name":"1号店","ename":"yihaodian","mall_id":288,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/QMMImg/2014/12/10/113721751.gif","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/5751151%E5%8F%B7%E5%BA%97.jpg"},{"site":"jumei.com","name":"聚美优品","ename":"jumeiyoupin","mall_id":134,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/42600QQ%E5%9B%BE%E7%89%8720151118110457.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/4542975%E8%81%9A%E7%BE%8E%E4%BC%98%E5%93%81.jpg"},{"site":"xiaojukeji.com","name":"滴滴打车","ename":"dididache","mall_id":17422,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/1455587%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E6%BB%B4%E6%BB%B4_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/2022768%E6%BB%B4%E6%BB%B4.jpg"},{"site":"uber.com","name":"优步","ename":"uber","mall_id":19200,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/1214875%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100Uber_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/274955Uber.jpg"},{"site":"ele.me","name":"饿了么","ename":"eleme","mall_id":19130,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/3850219eleme.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/308518%E9%A5%BF%E4%BA%86%E4%B9%88.jpg"},{"site":"gome.com.cn","name":"国美在线","ename":"guomei","mall_id":1,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/187390.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/3539160%E5%9B%BD%E7%BE%8E%E5%9C%A8%E7%BA%BF.jpg"},{"site":"nuomi.com","name":"百度糯米","ename":"nuomiwang","mall_id":237,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/2158637%E7%99%BE%E5%BA%A6%E7%B3%AF%E7%B1%B3.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/5820120%E7%99%BE%E5%BA%A6%E7%B3%AF%E7%B1%B3.jpg"},{"site":"kaola.com","name":"网易考拉海购","ename":"kaolahaigou","mall_id":17489,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/2131843%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E8%80%83%E6%8B%89%E6%B5%B7%E8%B4%AD_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/5415576%E7%BD%91%E6%98%93%E8%80%83%E6%8B%89.jpg"},{"site":"waimai.meituan.com","name":"美团外卖","ename":"meituanwaimai","mall_id":17476,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/3122745%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E7%BE%8E%E5%9B%A2%E5%A4%96%E5%8D%96_20151113.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/732270%E7%BE%8E%E5%9B%A2%E5%A4%96%E5%8D%96.jpg"},{"site":"wepiao.com","name":"微信电影票","ename":"weipiaoer","mall_id":19416,"summary":"","detail_info":"","img":"http://image3.quanmama.com/AdminImageUpload/40185670.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/611241%E5%BE%AE%E7%A5%A8%E5%84%BF.jpg"},{"site":"womai.com","name":"我买网","ename":"womaiwang","mall_id":90,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/4116887wmw.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/2936571%E6%88%91%E4%B9%B0%E7%BD%91.jpg"},{"site":"htinns.com","name":"汉庭","ename":"hanting","mall_id":1325,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/31269220160608173323.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/3621639%E6%B1%89%E5%BA%AD.jpg"},{"site":"suning.com","name":"苏宁易购","ename":"suningyigou","mall_id":382,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/534141QQ%E5%9B%BE%E7%89%8720151118110506.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/510229%E8%8B%8F%E5%AE%81%E6%98%93%E8%B4%AD.jpg"},{"site":"waimai.baidu.com","name":"百度外卖","ename":"baiduwaimai","mall_id":17403,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/5241181%E7%99%BE%E5%BA%A6%E5%A4%96%E5%8D%96logo.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/857646%E7%99%BE%E5%BA%A6%E5%A4%96%E5%8D%96.jpg"}],"malls":[{"site":"jd.com","name":"京东","ename":"jingdong","mall_id":348,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/3022529%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E4%BA%AC%E4%B8%9C_20151113.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/4359453%E4%BA%AC%E4%B8%9C.jpg"},{"site":"vip.com","name":"唯品会","ename":"weipinhui","mall_id":3003,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/450117QQ%E5%9B%BE%E7%89%8720151118110501.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/629165%E5%94%AF%E5%93%81%E4%BC%9A.jpg"},{"site":"yhd.com","name":"1号店","ename":"yihaodian","mall_id":288,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/QMMImg/2014/12/10/113721751.gif","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/5751151%E5%8F%B7%E5%BA%97.jpg"},{"site":"jumei.com","name":"聚美优品","ename":"jumeiyoupin","mall_id":134,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/42600QQ%E5%9B%BE%E7%89%8720151118110457.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/4542975%E8%81%9A%E7%BE%8E%E4%BC%98%E5%93%81.jpg"},{"site":"xiaojukeji.com","name":"滴滴打车","ename":"dididache","mall_id":17422,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/1455587%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E6%BB%B4%E6%BB%B4_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/2022768%E6%BB%B4%E6%BB%B4.jpg"},{"site":"uber.com","name":"优步","ename":"uber","mall_id":19200,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/1214875%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100Uber_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/274955Uber.jpg"},{"site":"ele.me","name":"饿了么","ename":"eleme","mall_id":19130,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/3850219eleme.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/308518%E9%A5%BF%E4%BA%86%E4%B9%88.jpg"},{"site":"gome.com.cn","name":"国美在线","ename":"guomei","mall_id":1,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/187390.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/3539160%E5%9B%BD%E7%BE%8E%E5%9C%A8%E7%BA%BF.jpg"},{"site":"nuomi.com","name":"百度糯米","ename":"nuomiwang","mall_id":237,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/2158637%E7%99%BE%E5%BA%A6%E7%B3%AF%E7%B1%B3.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/5820120%E7%99%BE%E5%BA%A6%E7%B3%AF%E7%B1%B3.jpg"},{"site":"kaola.com","name":"网易考拉海购","ename":"kaolahaigou","mall_id":17489,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/2131843%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E8%80%83%E6%8B%89%E6%B5%B7%E8%B4%AD_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/5415576%E7%BD%91%E6%98%93%E8%80%83%E6%8B%89.jpg"},{"site":"waimai.meituan.com","name":"美团外卖","ename":"meituanwaimai","mall_id":17476,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/3122745%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E7%BE%8E%E5%9B%A2%E5%A4%96%E5%8D%96_20151113.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/732270%E7%BE%8E%E5%9B%A2%E5%A4%96%E5%8D%96.jpg"},{"site":"wepiao.com","name":"微信电影票","ename":"weipiaoer","mall_id":19416,"summary":"","detail_info":"","img":"http://image3.quanmama.com/AdminImageUpload/40185670.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/611241%E5%BE%AE%E7%A5%A8%E5%84%BF.jpg"},{"site":"womai.com","name":"我买网","ename":"womaiwang","mall_id":90,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/4116887wmw.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/2936571%E6%88%91%E4%B9%B0%E7%BD%91.jpg"},{"site":"htinns.com","name":"汉庭","ename":"hanting","mall_id":1325,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/31269220160608173323.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/3621639%E6%B1%89%E5%BA%AD.jpg"},{"site":"suning.com","name":"苏宁易购","ename":"suningyigou","mall_id":382,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/534141QQ%E5%9B%BE%E7%89%8720151118110506.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/510229%E8%8B%8F%E5%AE%81%E6%98%93%E8%B4%AD.jpg"},{"site":"waimai.baidu.com","name":"百度外卖","ename":"baiduwaimai","mall_id":17403,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/5241181%E7%99%BE%E5%BA%A6%E5%A4%96%E5%8D%96logo.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/857646%E7%99%BE%E5%BA%A6%E5%A4%96%E5%8D%96.jpg"},{"site":"yougou.com","name":"优购网","ename":"yougouwang","mall_id":872,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/8533544.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/726542%E4%BC%98%E8%B4%AD.jpg"},{"site":"keede.com","name":"可得网","ename":"kedewang","mall_id":321,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/157587kdw.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/5529692%E5%8F%AF%E5%BE%97.jpg"},{"site":"ctrip.com","name":"携程","ename":"xiecheng","mall_id":27,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/3015302%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E6%90%BA%E7%A8%8B_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/643158%E6%90%BA%E7%A8%8B.jpg"},{"site":"muyingzhijia.com","name":"母婴之家","ename":"muyingzhigu","mall_id":136,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/2443209%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E6%AF%8D%E5%A9%B4%E4%B9%8B%E5%AE%B6_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/453443%E6%AF%8D%E5%A9%B4%E4%B9%8B%E5%AE%B6.jpg"},{"site":"dangdang.com","name":"当当","ename":"dangdangwang","mall_id":350,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/AdminImageUpload/201411419528309.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/215949%E5%BD%93%E5%BD%93.jpg"},{"site":"amazon.cn","name":"亚马逊","ename":"yamaxun","mall_id":357,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/261419a.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/73111%E4%BA%9A%E9%A9%AC%E9%80%8A.jpg"},{"site":"10101111.com","name":"神州专车","ename":"shenzhouzhuanche","mall_id":19312,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/1636980%E7%A5%9E%E5%B7%9E%E4%B8%93%E8%BD%A6.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"shangpin.com","name":"尚品网","ename":"shangpin","mall_id":386,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/4132620.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"alitrip.com","name":"阿里旅行","ename":"qua","mall_id":17410,"summary":"","detail_info":"","img":"http://image2.quanmama.com/AdminImageUpload/25289450.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"didishunfengche.com","name":"滴滴顺风车","ename":"didishunfengche","mall_id":19602,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/1541927%E6%BB%B4%E6%BB%B4%E9%A1%BA%E9%A3%8E%E8%BD%A6.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/2538154%E6%BB%B4%E6%BB%B4%E9%A1%BA%E9%A3%8E.jpg"},{"site":"zuche.com","name":"神州租车","ename":"shenzhouzuche","mall_id":1310,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/1729692%E7%A5%9E%E5%B7%9E%E7%A7%9F%E8%BD%A6.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"meituan.com","name":"美团","ename":"meituanwang","mall_id":235,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/212804%E7%BE%8E%E5%9B%A2.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/335985%E7%BE%8E%E5%9B%A22.jpg"},{"site":"maoyan.com","name":"猫眼电影","ename":"maoyandianying","mall_id":3162,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/1122020.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/41807%E7%8C%AB%E7%9C%BC.jpg"},{"site":"yohobuy.com","name":"YOHO!","ename":"youhuo","mall_id":936,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/1328726%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100yoho%E6%9C%89%E8%B4%A7_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/742891%E6%9C%89%E8%B4%A7.jpg"},{"site":"beibei.com","name":"贝贝网","ename":"beibeiwang","mall_id":17376,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/593464%E8%B4%9D%E8%B4%9D.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/1222693%E8%B4%9D%E8%B4%9D.jpg"},{"site":"tootoo.cn","name":"沱沱工社","ename":"tuotuogongshe","mall_id":891,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/270427%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E6%B2%B1%E6%B2%B1%E5%85%AC%E7%A4%BE_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"6pm.com","name":"6PM","ename":"6pm","mall_id":3062,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/37294076pm.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"yintai.com","name":"银泰网","ename":"yintaiwang","mall_id":362,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/3220107%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E9%93%B6%E6%B3%B0_20151113.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"qunar.com","name":"去哪儿","ename":"qunaer","mall_id":1113,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/2524658%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E5%8E%BB%E5%93%AA%E5%84%BF_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"mia.com","name":"蜜芽","ename":"miyabaobei","mall_id":17415,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/2347501%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E8%9C%9C%E8%8A%BD_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"ly.com","name":"同程网","ename":"tongchengwang","mall_id":1091,"summary":"","detail_info":"","img":"http://www.quanmama.com/AdminImageUpload/727195190x75.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"handu.com","name":"韩都衣舍","ename":"handuyishe","mall_id":1013,"summary":"","detail_info":"","img":"http://image2.quanmama.com/AdminImageUpload/9598971.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/3842694%E9%9F%A9%E9%83%BD%E8%A1%A3%E8%88%8D.jpg"},{"site":"shopbop.com","name":"shopbop","ename":"shopbop","mall_id":3129,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/456363Shopbop.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"fengqu.com","name":"丰趣海淘","ename":"fengquhaitao","mall_id":20372,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/182533%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E4%B8%B0%E8%B6%A3%E6%B5%B7%E6%B7%98_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/4930789%E4%B8%B0%E8%B6%A3%E6%B5%B7%E6%B7%982.jpg"},{"site":"jiuxian.com","name":"酒仙网","ename":"jiuxianwang","mall_id":164,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/QMMImg/2014/11/12/17523281.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/4912998%E9%85%92%E4%BB%99%E7%BD%91.jpg"},{"site":"ashford.com","name":"Ashford","ename":"ashford","mall_id":3027,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/14580Ashford.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/758912ashford.jpg"},{"site":"lemall.com","name":"乐视商城","ename":"leshishangcheng","mall_id":19321,"summary":"","detail_info":"","img":"http://image3.quanmama.com/AdminImageUpload/16238340.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/5410435%E4%B9%90%E8%A7%86%E5%95%86%E5%9F%8E.jpg"},{"site":"kfc","name":"肯德基","ename":"kendeji","mall_id":17190,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/5639468kfc.png","img_w":0,"img_h":0,"isKfc":"1","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/2146405kfc.png"},{"site":"lecake.com","name":"诺心蛋糕","ename":"nuoxin","mall_id":959,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/0459730.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"mdl","name":"麦当劳","ename":"maidanglao","mall_id":455,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/593138mdl.png","img_w":0,"img_h":0,"isKfc":"1","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/2930584mc.png"},{"site":"spider.com.cn","name":"蜘蛛网","ename":"zhizhuwang","mall_id":434,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/ImageUpload/201374163741791.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"yesmywine.com","name":"也买酒","ename":"yemaijiu","mall_id":83,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/387111yesmywine.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"hanbaowang","name":"汉堡王","ename":"hanbaowang","mall_id":914,"summary":"","detail_info":"","img":"http://image2.quanmama.com/AdminImageUpload/4813748hbw.png","img_w":0,"img_h":0,"isKfc":"1","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/3027556burgerking.png"},{"site":"zhengongfu","name":"真功夫","ename":"zhengongfu","mall_id":452,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/ImageUpload/2013310205634659.jpg","img_w":0,"img_h":0,"isKfc":"1","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/42550zhengongfu.png"},{"site":"xiu.com","name":"走秀网","ename":"zouxiuwang","mall_id":260,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/120374xiu.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"moonbasa.com","name":"梦芭莎","ename":"mengbasha","mall_id":320,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/594491mengbasha_logo.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"111.com.cn","name":"1药网","ename":"yihaoyaowang","mall_id":233,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/1462971yao.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"quwan.com","name":"趣玩网","ename":"quwanwang","mall_id":361,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/logo/quwan.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"lvmama.com","name":"驴妈妈","ename":"lvmama","mall_id":750,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/logo/lvmama.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"vmall.com","name":"华为商城","ename":"huaweishangcheng","mall_id":1214,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/ImageUpload/2013412142624806.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/408619%E5%8D%8E%E4%B8%BA%E5%95%86%E5%9F%8E.jpg"},{"site":"zhongjiu.cn","name":"中酒网","ename":"zhongjiuwang","mall_id":3031,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/ImageUpload/3517699zhongjiu.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"lefeng.com","name":"乐蜂网","ename":"lefengwang","mall_id":263,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/2246754%E5%88%B8%E5%A6%88%E5%A6%88%E8%BF%9B%E9%A9%BB%E5%95%86%E5%AE%B6logo200100%E4%B9%90%E8%9C%82%E7%BD%91_20151113_%E7%9C%8B%E5%9B%BE%E7%8E%8B.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/5332729%E4%B9%90%E8%9C%82%E7%BD%91.jpg"},{"site":"newegg.cn","name":"新蛋","ename":"xindan","mall_id":3006,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/21154590.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"gou.com","name":"麦乐购","ename":"mailegou","mall_id":904,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/1351116%E9%BA%A6%E4%B9%90%E8%B4%AD.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"secoo.com","name":"寺库","ename":"siku","mall_id":945,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/165867%E5%AF%BA%E5%BA%93.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"feiniu.com","name":"飞牛网","ename":"feiniuwang","mall_id":3060,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/2123414feiniu.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/3234721%E9%A3%9E%E7%89%9B.jpg"},{"site":"lifevc.com","name":"LifeVC","ename":"lifevc","mall_id":1248,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/logo/lifevc.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image2.juanlaoda.com/AdminImageUpload/07972%E4%B8%BD%E8%8A%99%E5%AE%B6%E5%B1%85.jpg"},{"site":"ehaier.com","name":"海尔商城","ename":"haiershangcheng","mall_id":1352,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/ImageUpload/201396201254877.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image3.juanlaoda.com/AdminImageUpload/414036%E6%B5%B7%E5%B0%94%E5%95%86%E5%9F%8E.jpg"},{"site":"yonghedawang","name":"永和大王","ename":"yonghedawang","mall_id":20647,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/ImageUpload/2013211194232.jpg","img_w":0,"img_h":0,"isKfc":"1","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/4140792yonghe.png"},{"site":"dks","name":"德克士","ename":"dekeshi","mall_id":907,"summary":"","detail_info":"","img":"http://www.quanmama.com/AdminImageUpload/5714680dks.png","img_w":0,"img_h":0,"isKfc":"1","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/394965dks.jpg"},{"site":"mogujie.com","name":"蘑菇街","ename":"mogujie","mall_id":3163,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/9276200.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"meilishuo.com","name":"美丽说","ename":"meilishui","mall_id":3170,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/3240387meilishuo.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"yunhou.com","name":"云猴全球购","ename":"yunhou","mall_id":3004,"summary":"","detail_info":"","img":"http://image2.juanlaoda.com/AdminImageUpload/917430%E4%BA%91%E7%8C%B4%E5%85%A8%E7%90%83%E8%B4%AD_logo%E6%96%B0%E7%89%88-%E6%94%B9-01.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/1925999%E4%BA%91%E7%8C%B4%E7%BD%91.jpg"},{"site":"sfbest.com","name":"顺丰优选","ename":"shunfengyouxuan","mall_id":1358,"summary":"","detail_info":"","img":"http://www.juanlaoda.com/QMMImg/2014/10/2/212417467.jpg","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"},{"site":"chaoshi.tmall.com","name":"天猫超市","ename":"tianmaochaoshi","mall_id":20929,"summary":"","detail_info":"","img":"http://image1.juanlaoda.com/AdminImageUpload/532272%E5%A4%A9%E7%8C%AB%E8%B6%85%E5%B8%82logo.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"0","background_img":"http://image1.juanlaoda.com/AdminImageUpload/529838%E5%A4%A9%E7%8C%AB%E8%B6%85%E5%B8%82.jpg"},{"site":"haiziwang.com","name":"孩子王","ename":"haiziwang","mall_id":639,"summary":"","detail_info":"","img":"http://image3.juanlaoda.com/AdminImageUpload/650395%E6%9C%AA%E6%A0%87%E9%A2%98-1.png","img_w":0,"img_h":0,"isKfc":"0","show_logo_img":"1","background_img":"http://image1.juanlaoda.com/AdminImageUpload/59259961173cd55a8bb3f33f4c980b3c09be680.jpg"}]}
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
		private List<HotMallsBean> hot_malls;
		private List<MallsBean> malls;

		public List<HotMallsBean> getHot_malls() {
			return hot_malls;
		}

		public void setHot_malls(List<HotMallsBean> hot_malls) {
			this.hot_malls = hot_malls;
		}

		public List<MallsBean> getMalls() {
			return malls;
		}

		public void setMalls(List<MallsBean> malls) {
			this.malls = malls;
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

		public static class MallsBean {
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
	}
}
