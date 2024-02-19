class Team {
    constructor(name) {
        this.name = name;
        this.deals = [];
    }
    // Add a deal to the team
    addDeal(deal) {
        this.deals.push(deal);
    }
    // Calculate annual budget for the team
    calculateBudget() {
        let totalExpense = 0;
        this.deals.forEach((deal) => {
            totalExpense += deal.amount;
        });
        return totalExpense;
    }
}

// Expense object constructor
class Expense {
    constructor(description, amount) {
        this.description = description;
        this.amount = amount;
    }
}



// Create team instances
const marketingTeam = new Team("Marketing");
const developmentTeam = new Team("Development");

// Add deals to teams
marketingTeam.addDeal(new Expense("Marketing Campaign", 5550));
marketingTeam.addDeal(new Expense("Ad Campaign", 3400));

developmentTeam.addDeal(new Expense("Software Development", 12500));
developmentTeam.addDeal(new Expense("Hardware Upgrade", 7900));

// Test the budget calculation
console.log(
  `${marketingTeam.name} Team Budget: $${marketingTeam.calculateBudget()}`
);
console.log(
  `${developmentTeam.name} Team Budget: $${developmentTeam.calculateBudget()}`
);
