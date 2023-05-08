package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MerchantApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchantApplication.class, args);
	}

}

class Application implements SignalHandler {
	public void handleSignal(int signal) {
		Algo algo = new Algo();

		switch (signal){

			default:
				algo.cancelTrades();
				break;
		}

		algo.doAlgo();
	}
}

