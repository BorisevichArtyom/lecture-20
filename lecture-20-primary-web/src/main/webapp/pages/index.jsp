<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Java web service</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>
</head>
<body class="d-flex flex-column h-100">
<main class="flex-shrink-0">
    <div class="container">
        <h1 class="mt-5">It's simple <i>${appName}</i>.</h1>
        <p class="lead">This page was enriched with: <strong class="d-inline-block mb-2 text-success">${controllerVariable}</strong></p>
        <div class="col-md-6">
            <p>You also can try:</p>
            <ul class="icon-list">
                <li><a href="${pageContext.request.contextPath}">Model and View</a></li>
                <li><a href="${pageContext.request.contextPath}/model">Model</a></li>
                <li><a href="${pageContext.request.contextPath}/map">Map</a></li>
            </ul>
        </div>
    </div>
</main>
</body>
</html>
