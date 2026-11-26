<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><c:out value="${appName}" /> - Status</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light d-flex align-items-center justify-content-center min-vh-100">
    <div class="card shadow-sm border-0" style="max-width: 520px; width: 100%;">
        <div class="card-body p-4 text-center">
            <span class="badge bg-success mb-3">ONLINE</span>
            <h1 class="h4 fw-bold mb-2"><c:out value="${appName}" /></h1>
            <p class="text-muted mb-0"><c:out value="${statusMessage}" /></p>
        </div>
    </div>
</body>
</html>

