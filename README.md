# demo0730
异常基本知识
	1. 异常的概念
	程序运行时发生的非正常事件
	
	非正常事件：
	异常（exception）	发生后程序可以处理，程序可以继续运行
	错误（error）	发生后，程序无法处理，程序停止执行
	通常所指的异常指的是exception，即程序运行过程中发生的非正常事件，程序可以对其进行处理，且程序会继续执行
	
	2. 异常的分类
	运行时异常	编译时不会检测这类异常，编译时不要求处理这类异常，可以选择处理或是不处理，运行时才会检测出此类异常
	非运行异常	也称为编译时异常，编译时会检测这类异常，并且要求必须处理这类异常，若不处理，编译不通过
	
	异常和错误的顶级父类是throwable，throwable下面有两个子类，exception和error。
	
	exception分为两类：
		非运行时异常：
			ioException
				sqlException
				……
		运行时异常
			RuntimeException
				NullPointException
				ArithmeticException
				IndexOutOfBoundsException
				illegalClassFormatException
	3. 异常处理
	异常处理的方式分为两类
		○ try有1个，catch有0~n个，finally有0~1个
		多个catch块，遵守规则，先子类后父类
		扩展：异常范围大小--父类异常范围大于子类异常范围；
		原因：上转型，所谓的异常范围大小，指的是子类上转型为父类类型的种类个数，就是子类的个数。（包括间接子类）
		
		finally块是异常处理的统一出口，无论是否抛出异常，均会执行
		
		try块不能单独存在，必须与catch块或finally块一起出现，
		思考：try……catch……finally与return
		return存在于try……catch……finally语句结构中的try、catch、以及finally中的执行过程
		try……catch块中存在return，但是finally中不存在，先执行return语句中的表达式，再执行finally块中语句，然后return返回表达式的值。
		try……catch……finally都存在return时，先执行try或catch块中的return语句中的表达式，然后再执行finally块中语句，若遇到return语句，执行并返回值，不管之前的return
		
		
		Try{
			//选定或划分抛出异常的区域
		}catch（异常类型 变量）{
			//匹配异常，匹配到就处理异常
		}……..
		 catch  (异常类型 变量n) {
		
		}finally{
			//不管是否抛出异常，finally语句块均会执行
		}
		○ Throws子句与throw语句
			throws子句是方法声明时的一部分
			throws子句是方法声明时用来指明方法抛出异常类型；
			语法格式：
				[修饰符]返回值类型 方法名称（[参数列表]）[throws 异常类名 1，……，异常类名 2]{
					//方法体
				}
				
		throws子句的作用，抛出方法中的异常，方法中对异常不做处理，由方法的调用者处理异常
		
		throw语句，用于抛出异常对象，手动引发异常
	4. 断言
	Assert 默认情况下未启用断言，需要在Edit Configurations ——>VM options
	工具中添加配置选项：-ea   
	断言主要是在开发阶段调试使用，在生产环境中不使用
