package com;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 生成JavaBean的工厂类。 在iReport的DataSource的配置中会用到。
 *
 * @author by Young.ZHU on 2012-8-3
 *
 *         Package&FileName: ds.javabean.StudentFactory
 */
public class PeopleFactory {
	// ~ Static fields/initializers *********************************************

	// 生成实体对象的个数
	private static final int RECORD_COUNT = 100;

	// ~ Methods ****************************************************************

	/**
	 * 这个方法在iReport的DataResource配置时也会用到 必须是静态方法 static
	 *
	 * @return
	 */
	public static Collection<People> createBeanCollection() {
		Collection<People> beanCollection = new ArrayList<People>();
		beanCollection.add(new People("robin", "0920"));
		return beanCollection;
	}
}
