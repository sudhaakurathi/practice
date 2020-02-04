Feature: Without add to cart
Scenario:The one where user moves to cart without adding any item in it
Given user has registered in to TestMeApp
When user search a particular product like headphones
And try to proceed to payment without adding anyitem in the cart
Then TestMeApp doesn't display the cart icon 