$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/featurecasestudy/casestudy4.feature");
formatter.feature({
  "name": "Without add to cart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The one where user moves to cart without adding any item in it",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user has registered in to TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "casestudy4.user_has_registered_in_to_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search a particular product like headphones",
  "keyword": "When "
});
formatter.match({
  "location": "casestudy4.user_search_a_particular_product_like_headphones()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "try to proceed to payment without adding anyitem in the cart",
  "keyword": "And "
});
formatter.match({
  "location": "casestudy4.try_to_proceed_to_payment_without_adding_anyitem_in_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TestMeApp doesn\u0027t display the cart icon",
  "keyword": "Then "
});
formatter.match({
  "location": "casestudy4.testmeapp_doesn_t_display_the_cart_icon()"
});
formatter.result({
  "status": "passed"
});
});