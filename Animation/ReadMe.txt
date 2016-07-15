
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

属性动画常用属性
1. translationX/translationY          偏移距离
2. rotation/rotationX/rotationY       旋转
3. scaleX/scaleY                      缩放
4. x/y                                x/y绝对坐标
5. alpha                              透明度

属性动画常用方法与类
1. ValueAnimator               数值发生器，实现灵活的动画效果
2. ObjectAnimator              ValueAnimator的子类，封装了ValueAnimator，通过ObjectAnimator操作一个对象的属性，实现动画效果
3. AnimatorUpdateListener      动画监听器
4. AnimatorListenerAdapter     动画监听器
5. PropertyValuesHolder        控制动画集合的显示效果、顺序和流程控制
6. AnimatorSet                 控制动画集合的显示效果、顺序和流程控制
7. TypeEvaluators              值计算器，用来控制数据的变化规律
8. Interpolators               用来控制数据的变化规律

常用interpolator
1. AccelerateInterpolator      加速
2. AnticipateInterpolator      先低于基准值再增长，先后退一些，再向目的位置前进
3. LinearInterpolator          匀速
4. DecelerateInterpolator      减速
5. BounceInterpolator          小球自由落体回弹效果
6. OvershootInterpolator       到达目的位置先超出一部分，再回到目标位置
