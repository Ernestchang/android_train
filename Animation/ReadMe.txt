
Animation分类
1. Tween Animation      变换动画
2. Frame Animation      逐帧动画
3. Property Animator    属性动画
4. Layout Animation     布局动画

Tween Animation分类
1. RotateAnimation      旋转
2. TranslateAnimation   移动
3. ScaleAnimation       缩放
4. AlphaAnimation       淡出

Tween Animation共同属性
1. duration        动画持续时间（单位：毫秒）
2. fillAfter       为true时，在动画结束时保持动画结束时状态
3. fillBefore      为true时，在动画结束时保持动画开始前状态
4. interpolator    动画加速度（加速、减速、先加速后减速）
5. repeatCount     动画重复次数
6. repeatMode      动画重复方式：顺序/倒序
7. startOffset     动画之间的时间间隔

Tween Animatioin 实现方式
1. 配置文件（/res/anim）  alpha / scale / translate / rotate
2. Java代码实现  AlphaAnimation / ScaleAnimation / TranslateAnimation / RotateAnimation

属性动画与传统动画的区别
1. 属性动画叫Animator，传统动画叫Animation
2. 传统动画是通过不断重绘，改变显示位置，而实现响应的位置并没有改变，所以不适用于做具有交互的动画效果，只能用来做一些显示性的效果。另外，传统动画不断重绘界面，会十分耗费GPU资源。
3. 属性动画让显示的位置和响应的位置都发生了变化，因为属性动画实实在在改变了图片的属性。

属性动画分类
1. ObjectAnimator

ObjectAnimator

