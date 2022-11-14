# 广西区通用自动大学习

---

> 目前项目还在测试阶段



## 使用方式

> 因为微信缘故，使用时可能有点麻烦，得先通过抓包软件抓取到微信对应访问大学习网站抓包抓到对应Cookie的SSUUID的值才行.
>
> 抓取过后直接调用AutoStudy函数计科创建一个大学习对应账户实例。然后通过调用对应创建的toStudy自定执行大学习。
>
> 如果返回的是一个链接JSON说明自动大学习成功。



### 使用实例

```java
public class Main{
    public static void main(String[] args){
        AutoStudy autoStudy = new AutoStudy("EF3SJG6FDKGgkdD39DGJKALA");
        autoStudy.toStudy(152);
    }
}
```

