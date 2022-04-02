package com.example.mamechishiki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mamechishiki.entity.Mamechishiki;
import com.example.mamechishiki.repository.MamechishikiRepository;

@SpringBootApplication
public class MamechishikiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MamechishikiApplication.class, args)
		.getBean(MamechishikiApplication.class).execuse();
	}
	@Autowired
	MamechishikiRepository repository;
//	実行メソッド
	private void execuse() {
//		登録処理
		setup();
	}
//	クイズを登録
	private void setup() {
//		エンティティ生成
		Mamechishiki mamechishiki1 = new Mamechishiki(null, "お茶を茶葉から淹れるときは時間は勿論、お湯の温度によっても味が変わる。", "まめ");
//		登録実行
		mamechishiki1 = repository.save(mamechishiki1);
//		登録確認
		System.out.println("登録したデータは、" + mamechishiki1 + "です。");
		
		Mamechishiki mamechishiki2 = new Mamechishiki(null, "沸騰したお湯を湯呑に入れると温度が約10度下がる。そのお湯を別の湯呑に入れると更に温度が約10度下がる。", "まめ");
		mamechishiki2 = repository.save(mamechishiki2);
		System.out.println("登録したデータは、" + mamechishiki2 + "です。");
		
		Mamechishiki mamechishiki3 = new Mamechishiki(null, "ニットのトップスをハンガーに干すときは、トップスを縦半分に折り、脇の部分とハンガーの首の部分を合わせ、腕と胴体の部分をハンガーに覆いかぶさる様にして干すと伸び辛い。", "まめ");
		mamechishiki3 = repository.save(mamechishiki3);
		System.out.println("登録したデータは、" + mamechishiki3 + "です。");
		
		Mamechishiki mamechishiki4 = new Mamechishiki(null, "キツネは食肉目（別名：ネコ目）イヌ科。", "まめ");
		mamechishiki4 = repository.save(mamechishiki4);
		System.out.println("登録したデータは、" + mamechishiki4 + "です。");
		
		Mamechishiki mamechishiki5 = new Mamechishiki(null, "落としても潰れない程硬い品種のトマトがある。", "まめ");
		mamechishiki5 = repository.save(mamechishiki5);
		System.out.println("登録したデータは、" + mamechishiki5 + "です。");
	}
}
