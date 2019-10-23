<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Taco Cloud</title>
    <link rel="stylesheet" th:href="@{/styles.css}" />
</head>
<body>
<form method="POST" action="/orders" <%--th:action="@{/orders}"--%> th:object="${order}">
    <h1>Order your taco creations!</h1>
    <%--<img th:src="@{/images/TacoCloud.png}"/>--%>
    <a th:href="@{/design}" id="another">Design another taco</a><br/>
    <%--<div th:if="${#fields.hasErrors()}">
<span class="validationError">
Please correct the problems below and resubmit.
</span>--%>
    </div>
    <h3>Deliver my taco masterpieces to...</h3>
    <label for="name">Name: </label>
    <input type="text" th:field="*{name}"/>
    <%--<span class="validationError"
          th:if="${#fields.hasErrors(*{name})}"
          th:errors="*{name}">ccExpiration error</span>
    <br/>--%>
    <label for="street">Street address: </label>
    <input type="text" th:field="*{street}"/>
    <%--<span class="validationError"
          th:if="${#fields.hasErrors(*{street})}"
          th:errors="*{street}">ccExpiration error</span>--%>
    <br/>
    <label for="city">City: </label>
    <input type="text" th:field="*{city}"/>
    <%--<span class="validationError"
          th:if="${#fields.hasErrors(*{city}}"
          th:errors="*{city}">ccExpiration error</span>--%>
    <br/>
    <label for="state">State: </label>
    <input type="text" th:field="*{state}"/>
    <%--<span class="validationError"
          th:if="${#fields.hasErrors(*{state})}"
          th:errors="*{state}">ccExpiration error</span>--%>
    <br/>
    <label for="zip">Zip code: </label>
    <input type="text" th:field="*{zip}"/>
    <%--<span class="validationError"
          th:if="${#fields.hasErrors(*{zip})}"
          th:errors="*{zip}">ccExpiration error</span>--%>
    <br/>
    <h3>Here's how I'll pay...</h3>
    <label for="ccNumber">Credit Card #: </label>
    <input type="text" th:field="*{ccNumber}"/>
    <%--<span class="validationError"
          th:if="${#fields.hasErrors(*{ccNumber})}"
          th:errors="*{ccNumber}">ccExpiration error</span>--%>
    <br/>
    <label for="ccExpiration">Expiration: </label>
    <input type="text" th:field="*{ccExpiration}"/>
   <%-- <span class="validationError"
          th:if="${#fields.hasErrors(*{ccExpiration})}"
          th:errors="*{ccExpiration}">ccExpiration error</span>--%>
    <br/>
    <label for="ccCVV">CVV: </label>
    <input type="text" th:field="*{ccCVV}"/>
    <%--<span class="validationError"
          th:if="${#fields.hasErrors(*{ccCVV})}"
          th:errors="*{ccCVV}">ccCVV error</span>--%>
    <br/>
    <input type="submit" value="Submit order"/>
</form>
</body>
</html>