package com.my.tool;
import com.github.houbb.opencc4j.core.impl.ZhConvertBootstrap;
import org.springframework.context.annotation.Bean;


public class TranslateTool {
    /**
     * 不管那么多直接转换成简体
     * @param original
     * @return
     */
    public static String TCTOCN(String original){
        return ZhConvertBootstrap.newInstance().toSimple(original);
    }

    /**
     * 不管那么多直接转换成繁体
     * @param original
     * @return
     */
    public static String CNTOTC(String original){
        return ZhConvertBootstrap.newInstance().toTraditional(original);
    }

}
