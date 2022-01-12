/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  com.github.catvod.crawler.SpiderReq
 *  com.github.catvod.crawler.SpiderReqResult
 *  com.github.catvod.crawler.SpiderUrl
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URLEncoder
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.crawler.SpiderReq;
import com.github.catvod.crawler.SpiderReqResult;
import com.github.catvod.crawler.SpiderUrl;
import com.github.catvod.spider.merge.cZa;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class Enlienli
extends Spider {
    private String K = cZa.d("0E381927126249630C270876073C1D790A37082B0F221839482F023A");

    private HashMap<String, String> K(String string) {
        string = new HashMap();
        string.put((Object)cZa.d("25230339043B12250239"), (Object)cZa.d("2D2908274C190A251B32"));
        string.put((Object)cZa.d("333F08254C1901290323"), (Object)cZa.d("092705231528497843674F69"));
        return string;
    }

    public String categoryContent(String string, String string2, boolean bl, HashMap<String, String> spiderUrl) {
        StringBuilder stringBuilder;
        int n;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.K);
        stringBuilder2.append(cZa.d("492D1D3E4F280E3C42271337102509324E2E0928323B082B12731D36063D5B"));
        stringBuilder2.append(string2);
        stringBuilder2.append(cZa.d("4025096A"));
        stringBuilder2.append(string);
        string = stringBuilder2.toString();
        for (String string3 : spiderUrl.keySet()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(cZa.d("40"));
            stringBuilder.append(string3);
            stringBuilder.append(cZa.d("5B"));
            stringBuilder.append(URLEncoder.encode((String)((String)spiderUrl.get((Object)string3))));
            string = stringBuilder.toString();
        }
        spiderUrl = new SpiderUrl(string, super.K(string));
        string = SpiderReq.get((SpiderUrl)spiderUrl);
        spiderUrl = new JSONArray(((SpiderReqResult)string).content);
        string = new JSONArray();
        int n2 = 0;
        do {
            if (n2 >= spiderUrl.length()) break;
            stringBuilder2 = spiderUrl.getJSONObject(n2);
            stringBuilder = new JSONObject();
            stringBuilder.put(cZa.d("10230908083C"), (Object)stringBuilder2.getString(cZa.d("0F28")));
            stringBuilder.put(cZa.d("102309080F390B29"), (Object)stringBuilder2.getString(cZa.d("082D0032")));
            stringBuilder.put(cZa.d("10230908113105"), (Object)stringBuilder2.getString(cZa.d("0F210A")));
            stringBuilder.put(cZa.d("10230908133D0B2D1F3C12"), (Object)stringBuilder2.getString(cZa.d("1725033019310239")));
            string.put((Object)stringBuilder);
            ++n2;
            continue;
            break;
        } while (true);
        try {
            spiderUrl = new JSONObject();
            n = Integer.parseInt((String)string2);
            n2 = string.length() < 20 ? n : n + 1;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
        spiderUrl.put(cZa.d("162D0A32"), n);
        spiderUrl.put(cZa.d("162D0A320237132219"), n2);
        spiderUrl.put(cZa.d("0A25003E15"), 20);
        spiderUrl.put(cZa.d("122319360D"), Integer.MAX_VALUE);
        spiderUrl.put(cZa.d("0A251E23"), (Object)string);
        string = spiderUrl.toString();
        return string;
    }

    public String detailContent(List<String> object) {
        try {
            Object object2 = new StringBuilder();
            object2.append(this.K);
            object2.append(cZa.d("492D1D3E4F280E3C42271337102509324E2E09283233042C0725016815370D29036A47310271"));
            object2.append((String)object.get(0));
            object2.append(cZa.d("402D0E6A17370213093215390F20"));
            object2 = object2.toString();
            SpiderUrl spiderUrl = new SpiderUrl((String)object2, super.K((String)object2));
            object2 = SpiderReq.get((SpiderUrl)spiderUrl);
            spiderUrl = new JSONObject(object2.content);
            object2 = new JSONObject();
            object2.put(cZa.d("10230908083C"), object.get(0));
            object2.put(cZa.d("102309080F390B29"), (Object)spiderUrl.getString(cZa.d("082D0032")));
            object2.put(cZa.d("10230908113105"), (Object)spiderUrl.getString(cZa.d("0F210A")));
            object2.put(cZa.d("12351D323E36072108"), (Object)spiderUrl.getString(cZa.d("12351D32")));
            object2.put(cZa.d("10230908183D073E"), (Object)"");
            object2.put(cZa.d("10230908002A032D"), (Object)"");
            object2.put(cZa.d("10230908133D0B2D1F3C12"), (Object)spiderUrl.getString(cZa.d("14290036133315")));
            object2.put(cZa.d("10230908003B12231F"), (Object)spiderUrl.getString(cZa.d("072F193813")));
            object2.put(cZa.d("10230908053114290E230E2A"), (Object)spiderUrl.getString(cZa.d("02251F32022C093E")));
            object2.put(cZa.d("1023090802370838083915"), (Object)spiderUrl.getString(cZa.d("0F220B38")));
            object2.put(cZa.d("1023090811340735323113370B"), (Object)spiderUrl.getString(cZa.d("16200C2E02370229")));
            object2.put(cZa.d("102309081134073532221334"), (Object)spiderUrl.getString(cZa.d("16200C2E0D311538")));
            spiderUrl = new JSONObject();
            object = new JSONArray();
            object.put(object2);
            spiderUrl.put(cZa.d("0A251E23"), object);
            object = spiderUrl.toString();
            return object;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String homeContent(boolean bl) {
        String string = cZa.d("10");
        String string2 = cZa.d("08");
        String string3 = cZa.d("082D0032");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.K);
        stringBuilder.append(cZa.d("492D1D3E4F280E3C42271337102509324E30092108080F391073"));
        SpiderUrl spiderUrl = new SpiderUrl(stringBuilder.toString(), super.K(this.K));
        SpiderReqResult spiderReqResult = SpiderReq.get((SpiderUrl)spiderUrl);
        JSONArray jSONArray = new JSONArray(spiderReqResult.content);
        JSONArray jSONArray2 = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        int n = 0;
        do {
            block41: {
                block43: {
                    String string4;
                    if (n >= jSONArray.length()) break;
                    spiderUrl = jSONArray.getJSONObject(n);
                    String string5 = spiderUrl.getString(string3);
                    String string6 = spiderUrl.getString(cZa.d("0F28"));
                    if (string5.equals((Object)cZa.d("80C2C5BFECC8"))) break block41;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(cZa.d("12351D323E3102"), (Object)string6);
                    jSONObject2.put(cZa.d("12351D323E36072108"), (Object)string5);
                    jSONArray2.put((Object)jSONObject2);
                    String string7 = string3;
                    spiderUrl = spiderUrl.getJSONArray(cZa.d("0B3F0A"));
                    String string8 = string3;
                    String string9 = string3;
                    jSONObject2 = new JSONArray();
                    int n2 = 0;
                    do {
                        void var6_41;
                        block42: {
                            String string10;
                            String string11 = string3;
                            if (n2 >= spiderUrl.length()) break;
                            String string12 = string3;
                            JSONObject jSONObject3 = spiderUrl.getJSONObject(n2);
                            String string13 = string3;
                            String string14 = jSONObject3.getString(string3);
                            String string15 = string3;
                            JSONArray jSONArray3 = jSONObject3.getJSONArray(cZa.d("022D1936"));
                            String string16 = string3;
                            if (jSONArray3.length() <= 1) {
                                String string17 = string3;
                                break block42;
                            }
                            String string18 = string3;
                            String string19 = jSONArray3.getString(0);
                            String string20 = string3;
                            String string21 = string3;
                            jSONObject3 = new JSONObject();
                            String string22 = string3;
                            jSONObject3.put(cZa.d("0D2914"), (Object)string14);
                            String string23 = string3;
                            jSONObject3.put(string3, (Object)string19);
                            String string24 = string3;
                            String string25 = string3;
                            string14 = new JSONArray();
                            String string26 = string3;
                            String string27 = string3;
                            string19 = new JSONObject();
                            String string28 = string3;
                            string19.put(string2, (Object)cZa.d("83C9C5BEE2F0"));
                            String string29 = string3;
                            string19.put(string, (Object)"");
                            String string30 = string3;
                            string14.put((Object)string19);
                            int n3 = 1;
                            do {
                                String string31;
                                String string32 = string3;
                                if (n3 >= jSONArray3.length()) break;
                                String string33 = string3;
                                String string34 = string3;
                                string19 = new JSONObject();
                                string3 = string31 = string3;
                                string19.put(string2, (Object)jSONArray3.getString(n3));
                                string3 = string31;
                                string19.put(string, (Object)jSONArray3.getString(n3));
                                string3 = string31;
                                string14.put((Object)string19);
                                ++n3;
                                string3 = string31;
                                continue;
                                break;
                            } while (true);
                            string3 = string10 = string3;
                            jSONObject3.put(cZa.d("102D012204"), (Object)string14);
                            string3 = string10;
                            jSONObject2.put((Object)jSONObject3);
                        }
                        ++n2;
                        string3 = var6_41;
                    } while (true);
                    string3 = string4 = string3;
                    try {
                        jSONObject.put(string6, (Object)jSONObject2);
                        string3 = string4;
                        break block41;
                    }
                    catch (Exception exception) {
                        break block43;
                    }
                    catch (Exception exception) {
                        void var6_44;
                        string3 = var6_44;
                    }
                }
                SpiderDebug.log((Throwable)spiderUrl);
            }
            ++n;
        } while (true);
        try {
            string3 = new JSONObject();
            string3.put(cZa.d("05200C2412"), (Object)jSONArray2);
            if (!bl) return string3.toString();
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
        string3.put(cZa.d("00250123042A15"), (Object)jSONObject);
        return string3.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String homeVideoContent() {
        String string;
        int n;
        Object object;
        Object object2;
        String string2;
        block11: {
            string2 = cZa.d("102509320E");
            string = cZa.d("123A");
            object = new StringBuilder();
            object.append(this.K);
            object.append(cZa.d("492D1D3E4F280E3C42271337102509324E30092108080539122D5227003F03715C71083C5B7C"));
            object = object.toString();
            object2 = new SpiderUrl((String)object, this.K((String)object));
            object = SpiderReq.get((SpiderUrl)object2);
            JSONObject jSONObject = new JSONObject(object.content);
            object = new JSONArray();
            boolean bl = jSONObject.has(string);
            object2 = cZa.d("022D1936");
            int n2 = 0;
            if (bl) {
                string = jSONObject.getJSONObject(string).getJSONArray((String)object2);
                for (n = 0; n < string.length(); ++n) {
                    object.put((Object)string.getJSONObject(n));
                }
            }
            if (!jSONObject.has(string2)) break block11;
            string = jSONObject.getJSONArray(string2);
            for (n = 0; n < string.length(); ++n) {
                string2 = string.getJSONObject(n).getJSONArray((String)object2);
                for (int j = 0; j < string2.length(); ++j) {
                    object.put((Object)string2.getJSONObject(j));
                }
            }
        }
        try {
            string2 = new JSONArray();
            for (n = n2; n < object.length(); ++n) {
                string = object.getJSONObject(n);
                object2 = new JSONObject();
                object2.put(cZa.d("10230908083C"), (Object)string.getString(cZa.d("0F28")));
                object2.put(cZa.d("102309080F390B29"), (Object)string.getString(cZa.d("082D0032")));
                object2.put(cZa.d("10230908113105"), (Object)string.getString(cZa.d("0F210A")));
                object2.put(cZa.d("10230908133D0B2D1F3C12"), (Object)string.getString(cZa.d("1725033019310239")));
                string2.put(object2);
            }
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
        object = new JSONObject();
        object.put(cZa.d("0A251E23"), (Object)string2);
        return object.toString();
    }

    public void init(Context context) {
        super.init(context);
    }

    public String playerContent(String string, String string2, List<String> list) {
        try {
            string = new JSONObject();
            string.put(cZa.d("162D1F2404"), 0);
            string.put(cZa.d("16200C2E342A0A"), (Object)"");
            string.put(cZa.d("133E01"), (Object)string2);
            string = string.toString();
            return string;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
    }

    public String searchContent(String string, boolean bl) {
        if (bl) {
            return "";
        }
        Object object = new StringBuilder();
        object.append(this.K);
        object.append(cZa.d("492D1D3E4F280E3C42271337102509324E2B032D1F34090714291E220D2C593A0433043739220C3A0465"));
        object.append(URLEncoder.encode((String)string));
        object = object.toString();
        string = new SpiderUrl((String)object, super.K((String)object));
        object = SpiderReq.get((SpiderUrl)string);
        string = new JSONObject(object.content);
        JSONArray jSONArray = string.getJSONObject(cZa.d("14291E220D2C")).getJSONArray(cZa.d("15290C250230393E0824143412"));
        string = new JSONArray();
        int n = 0;
        do {
            if (n >= jSONArray.length()) break;
            JSONObject jSONObject = jSONArray.getJSONObject(n);
            object = new JSONObject();
            object.put(cZa.d("10230908083C"), (Object)jSONObject.getString(cZa.d("0F28")));
            object.put(cZa.d("102309080F390B29"), (Object)jSONObject.getString(cZa.d("102509320E07082D0032")));
            object.put(cZa.d("10230908113105"), (Object)jSONObject.getString(cZa.d("0F210A")));
            string.put(object);
            ++n;
            continue;
            break;
        } while (true);
        try {
            object = new JSONObject();
            object.put(cZa.d("0A251E23"), (Object)string);
            string = object.toString();
            return string;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
    }
}

