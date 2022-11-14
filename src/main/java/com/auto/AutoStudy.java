package com.auto;

import okhttp3.*;

import java.io.IOException;

public class AutoStudy {

    private String SSCCID;
    private String SSUUID;
    private String hm_lvt;
    private String Hm_lpvt;

    private String phoneId = "Mozilla/5.0 (Linux; Android 12; M2102J2SC Build/SKQ1.211006.001; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/86.0.4240.99 XWEB/4317 MMWEBSDK/20220903 Mobile Safari/537.36 MMWEBID/2574 MicroMessenger/8.0.28.2240(0x28001C57) WeChat/arm64 Weixin NetType/4G Language/zh_CN ABI/arm64";


    @Deprecated
    public AutoStudy(String SSCCID,String SSUUID, String hm_lvt, String hm_lpvt) {
        this.SSCCID = SSCCID;
        this.SSUUID = SSUUID;
        this.hm_lvt = hm_lvt;
        Hm_lpvt = hm_lpvt;
    }

    /**
     * 传入微信抓包获得的SSUUID
     * @param SSUUID
     */
    public AutoStudy(String SSUUID) {
        this.SSUUID = SSUUID;
    }

    /**
     *
     * @param fop 所学的期数比如152代表2022年第25期
     * @return
     */
    public String toStudy(Integer fop){

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "id="+fop);
        Request request = new Request.Builder()
                .url("http://qndxx.bestcood.com/mp/gx/DaXueXi/LearnHit.html")
                .method("POST", body)
                .addHeader("User", "Mozilla/5.0 (Linux; Android 12; M2102J2SC Build/SKQ1.211006.001; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/86.0.4240.99 XWEB/4317 MMWEBSDK/20220903 Mobile Safari/537.36 MMWEBID/2574 MicroMessenger/8.0.28.2240(0x28001C57) WeChat/arm64 Weixin NetType/4G Language/zh_CN ABI/arm64")
                .addHeader("X-Requested-With", "com.tencent.mm")
                .addHeader("Host", "qndxx.bestcood.com")
                .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/wxpic,image/tpg,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                .addHeader("User-Agent", phoneId)
//                .addHeader("Cookie", "SSCCID=gouwfzlw5o50vb52plx4mh3m; SSUUID=3FC8F3B867A95F74E22492CA94376A45447752B12A04AB3076DF52A47BDDF499528AF93B18A70B0A1ED519A038D52D1E01BE8603F7DD0DC7E6136AE4C38675D8EC4A6A7177C975689580013C7175D9E2C5878DF76538553DAC647FC58BD132B3C36F1BF9B8AB5A2450B5FC1099B7D086B741B1D116B335FBAC93016650CA7C8CF08704B3B31732F70307D149F92D2841; Hm_lvt_74c22f30aa22887a15fa57c4c3c72305=1665647605; Hm_lpvt_74c22f30aa22887a15fa57c4c3c72305=1668166293; SSCCID=stvl5ni12br1gw3xryuzdvdq")
                .addHeader("Cookie", "SSCCID="+SSCCID+"; SSUUID="+SSUUID+"; Hm_lvt_74c22f30aa22887a15fa57c4c3c72305="+Hm_lpvt+"; Hm_lpvt_74c22f30aa22887a15fa57c4c3c72305="+Hm_lpvt+"; SSCCID="+SSCCID)
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();
        try {
            Response response = client.newCall(request).execute();
//            System.out.println(response.body().string());
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

}
