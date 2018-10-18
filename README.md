# TimeDemo

效果图：

![Image text](/gif/anim.gif)


使用方法：




        <!--文本选中颜色-->
        <attr name="TSTextSelectedColor" format="color"/>
        <!--文本未选中颜色-->
        <attr name="TSTextUnSelectedColor" format="color"/>
        <!--文本大小-->
        <attr name="TSTextSize" format="dimension"/>
        <!--选中背景颜色-->
        <attr name="TSSelectedBackgroundColor" format="color"/>
        <!--未选中背景颜色-->
        <attr name="TSUnSelectedBackgroundColor" format="color"/>
        <!--边框颜色-->
        <attr name="TSBorderColor" format="color"/>
        <!--边框宽度-->
        <attr name="TSBorderWidth" format="dimension"/>
        
        
接口：

        public interface OnChangeTimeListener{
            void onChangeTime(boolean isSelect, List<Integer> seletedList);
        }
        
