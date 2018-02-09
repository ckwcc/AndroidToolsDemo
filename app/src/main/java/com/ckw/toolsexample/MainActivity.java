package com.ckw.toolsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 这个Demo用于学习Android的tools命名空间
 * tools的好处在于支持开发阶段的预览效果，同时又不会把开发时的测试数据打入apk包中
 * 创建的xml默认有了xmlns:tools="http://schemas.android.com/tools 这行代码，
 * 我们可以直接使用它相应的功能了
 *
 * 1.对于View的使用：
 * 对于xml中的View的任何属性，都可以相应地被替代，
 * 例如 android:text="测试时用的数据" 可以替换成 tools:text="测试时用的数据"
 * （上面的效果是xml的preview可以看到效果，但是程序运行起来后并不会有该测试数据）
 *
 * 2.tools:context="com.ckw.toolsexample.MainActivity" xml中默认会生成这行代码
 * 有了这行代码以后，就可以直接在xml声明比如onClick等方法，
 * 例如Button的点击事件，写了以后会有红线提示，根据提示就可以在Activity中自动生成代码
 *
 *3.对于include 的布局，想要在include布局中看到外层的布局，可以使用
 * tools:showIn="@layout/外层布局"来达到在内层看到整个预览的效果
 * 之前有点小问题是使用了include之后（与showIn无关），外层整个布局有时候会消失，如果注释掉include的代码又会出现，
 * 同时显示掉了以后运行的话，显示又是正确的，可能是我哪里做错了吧
 * 最后坑逼的来了，重启一下Android Studio就好了。。。
 *
 * 4.对于ListView，GridView，支持以下属性：
 *  tools:listheader="@layout/list_header" 头布局
    tools:listfooter="@layout/list_footer" 尾布局
    tools:listitem="@layout/list_content" item布局
 *其中list_header等是自己需要加载的布局，里面的数据显示可以
 * 通过@tools:sample/...来获得，或者也可以使用自定义的json文件来获取假数据
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void testClick(View view) {
        Toast.makeText(this,"点击了button",Toast.LENGTH_SHORT).show();
    }
}
