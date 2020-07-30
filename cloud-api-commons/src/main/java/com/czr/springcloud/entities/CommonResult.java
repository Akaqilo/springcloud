package com.czr.springcloud.entities;

import com.czr.springcloud.util.ArithUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author czr
 * @Description: 类
 * @create 2020-06-08 14:31
 * @servion 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message)    {
        this(code,message,null);
    }

    /**
     * 测试算法精度
     */
    // public static void main(String[] args) throws IllegalAccessException{
    //     double d = ArithUtil.div(1, 10);
    //     System.out.println(d);
    //     System.out.println(Math.ceil(0.9));
    //     double c = 5.6;
    //     System.out.println(Math.ceil(c));
    // }

}
