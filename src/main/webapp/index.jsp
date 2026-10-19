<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Simple Calculator</title>
    <style>
        body { font-family: 'Arial', sans-serif; display: flex; justify-content: center; margin-top: 80px; background-color: #f8fafc; }
        .calc-container { background: white; padding: 35px; border-radius: 8px; box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1); width: 340px; }
        h2 { color: #1b2a7a; text-align: center; margin-bottom: 25px; }
        label { display: block; margin-top: 15px; font-weight: bold; color: #333; font-size: 14px; }
        input, select { padding: 10px; margin-top: 5px; width: 100%; border: 1px solid #ccc; border-radius: 4px; box-sizing: border-box; }
        button { background-color: #1b2a7a; color: white; padding: 12px; border: none; border-radius: 4px; cursor: pointer; width: 100%; font-weight: bold; margin-top: 20px; }
        button:hover { background-color: #121c54; }
    </style>
</head>
<body>
    <div class="calc-container">
        <h2>Simple Calculator</h2>
        <form action="calculate" method="POST">
            <label>First operand:</label>
            <input type="number" step="any" name="first-operand" placeholder="Toán hạng đầu tiên" required />
            <label>Operator:</label>
            <select name="operator">
                <option value="+">Cộng (+)</option>
                <option value="-">Trừ (-)</option>
                <option value="*">Nhân (*)</option>
                <option value="/">Chia (/)</option>
            </select>
            <label>Second operand:</label>
            <input type="number" step="any" name="second-operand" placeholder="Toán hạng thứ hai" required />
            <button type="submit">Calculate</button>
        </form>
    </div>
</body>
</html>
