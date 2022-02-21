package com.luxoft.effectivejava.module05.item33;

public enum CreditRequestState {
	ANALYSIS {
		@Override
		public double calculateCommission() {
			return 0;
		}
	}, ACCEPTED {
		@Override
		public double calculateCommission() {
			return 0.5;
		}
	}, REJECTED {
		@Override
		public double calculateCommission() {
			return 1.0;
		}
	};

	public abstract double calculateCommission();
}
