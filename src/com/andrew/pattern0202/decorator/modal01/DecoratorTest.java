package com.andrew.pattern0202.decorator.modal01;

/**
 * 1.×°ÊÎÕßÄ£Ê½
 * 
 * @author andrew
 * @date 2018/05/08
 */
public class DecoratorTest {
	public static void main(String[] args) {
		Food food = new PorkRib();
		food = new Vinegar(food);
		food = new Suger(food);
		System.out.println(food.getDesc());
		System.out.println(new Sauerkraut(new Fish()).getDesc());
	}
}

abstract class Food {
	String desc;
	String getDesc() {
		return desc;
	}
}

abstract class Condiment extends Food {
	abstract String getDesc();
}

class Fish extends Food {
	Fish() {
		desc = "Óã";
	}
}

class PorkRib extends Food {
	PorkRib() {
		desc = "ÅÅ¹Ç";
	}
}

class Suger extends Condiment {
	Food food;
	Suger(Food food) {
		this.food = food;
	}
	@Override  
    String getDesc() {  
        return "ÌÇ" + food.getDesc();
    }
}

class Vinegar extends Condiment {
	Food food;
	Vinegar(Food food) {
		this.food = food;
	}
	@Override
    String getDesc() {
		return "´×" + food.getDesc();
	}
}

class Sauerkraut extends Condiment {
	Food food;
	Sauerkraut(Food food) {
		this.food = food;
	}
	@Override
	String getDesc() {
		return "Ëá²Ë" + food.getDesc();
	}
}



