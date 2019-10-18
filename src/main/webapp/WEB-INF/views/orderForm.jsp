<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Taco Cloud</title>
    <link rel="stylesheet" th:href="@{/styles.css}" />
</head>
<body>
<form method="POST" th:action="@{/orders}" th:object="${order}">
    <h1>Order your taco creations!</h1>
    <img th:src="@{/images/TacoCloud.png}"/>
    <a th:href="@{/design}" id="another">Design another taco</a><br/>
    <div th:if="${#fields.hasErrors()}">
<span class="validationError">
Please correct the problems below and resubmit.
</span>
    </div>
    <h3>Deliver my taco masterpieces to...</h3>
    <label for="name">Name: </label>
    <input type="text" th:field="*{name}"/>
    <br/>
    <label for="street">Street address: </label>
    <input type="text" th:field="*{street}"/>
    <br/>
    <label for="city">City: </label>
    <input type="text" th:field="*{city}"/>
    <br/>
    <label for="state">State: </label>
    <input type="text" th:field="*{state}"/>
    <br/>
    <label for="zip">Zip code: </label>
    <input type="text" th:field="*{zip}"/>
    <br/>
    <h3>Here's how I'll pay...</h3>
    <label for="ccNumber">Credit Card #: </label>
    <input type="text" th:field="*{ccNumber}"/>
    <br/>
    <label for="ccExpiration">Expiration: </label>
    <input type="text" th:field="*{ccExpiration}"/>
    <br/>
    <label for="ccCVV">CVV: </label>
    <input type="text" th:field="*{ccCVV}"/>
    <br/>
    <input type="submit" value="Submit order"/>
</form>
</body>
</html>