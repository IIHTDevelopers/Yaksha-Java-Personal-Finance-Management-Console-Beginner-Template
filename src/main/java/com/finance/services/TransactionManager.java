package com.finance.services;

import java.util.List;

import com.finance.exception.InvalidAmountException;
import com.finance.models.Transaction;

public class TransactionManager {

	private List<Transaction> transactions; // Store all transactions

	// Constructor
	public TransactionManager() {
		// write your logic here
	}

	// Method to add a new expense
	public void addExpense(double amount, String description, String category) throws InvalidAmountException {
		// write your logic here
	}

	// Method to update an existing transaction (expense)
	public void updateTransaction(int index, double amount, String description, String category)
			throws InvalidAmountException {
		// write your logic here
	}

	// Method to get the list of all transactions (expenses)
	public List<Transaction> getAllTransactions() {
		// write your logic here
		return null;
	}

	// Method to get the list of all transactions (expenses) for a specific category
	public List<Transaction> getTransactionsByCategory(String category) {
		// write your logic here
		return null;
	}

	// Method to get the balance (income minus total expenses)
	public double getBalance(double monthlyIncome) {
		// write your logic here
		return 0;
	}
}
