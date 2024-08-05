<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sentence Converter</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            max-width: 600px;
            padding: 20px;
            background: #ffffff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        .form-group label {
            font-weight: bold;
        }
        .btn-custom {
            background-color: #007BFF;
            color: #ffffff;
            border: none;
        }
        .btn-custom:hover {
            background-color: #0056b3;
        }
        .btn-secondary {
            background-color: #28a745;
            color: #ffffff;
            border: none;
        }
        .btn-secondary:hover {
           background-color: #218838;
        }
        .output-container {
            margin-top: 20px;
            text-align: center;
        }
        .output-container  {
            font-size: 18px;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2 class="text-center mb-4">Sentence Converter</h2>
        <form id="sentenceForm" action="EvalueatorController" method="post">
            <div class="form-group">
                <label for="sentenceInput">Enter Sentence:</label>
                <input type="text" id="sentenceInput" name="Sentence" value="${sen}" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="conversionType">Select Type:</label>
                <select id="conversionType" name="conversionType"  class="form-control" >
                    <option value="${typ}"  >Selected type ${typ}</option>
                    <option>UpperCase</option>
                    <option>LowerCase</option>
                    <option>CamelCase</option>
                    <option>Character Count</option>
                    <option>Word Count</option>
                </select>
            </div>
            <div class="form-group text-center">
                <button type="submit" class="btn btn-secondary">Submit</button>
                <a href="index.jsp" class="btn btn-custom ml-2">Refresh</a>
            </div>
            
        </form>
        <div class="output-container">
            <h2>${title}</h2>
           
            <p >${result}</p>
        </div>
    </div>
</body>
</html>
