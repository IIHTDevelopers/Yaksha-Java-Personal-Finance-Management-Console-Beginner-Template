package com.finance.inventory;

import java.util.List;
import java.util.Map;

import com.finance.exception.InvalidAmountException;
import com.finance.exception.InvalidCategoryException;
import com.finance.models.Transaction;

public class TransactionManager {

	private List<Transaction> transactions; // Store all transactions
	private Map<String, Double> categoryBudgets; // Store budgets for each category (not used anymore)

	// Constructor
	public TransactionManager() {
	}

	// Method to add a new expense
	public void addExpense(double amount, String description, String category)
			throws InvalidAmountException, InvalidCategoryException {
		// write your logic here
	}

	// Method to update an existing transaction (expense)
	public void updateTransaction(int index, double amount, String description, String category)
			throws InvalidAmountException, InvalidCategoryException {
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
