<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vehicle Registration</title>
        <link href="Css/newcss.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="head">
            <img src="header image.jpg" alt=""/>
            <div class="txtcontainer">
               <h1>Vehicle Registration</h1>
            </div>
        </div>
        <br>
        
        <div class="container">
        <form method="Post" action="FormConfig">
            <label>ID</label>
            <label class="star">*</label><br>
            <input type="text" name="id" required><br>
            <label>Name</label><br>
            <input type="text" name="name" required><br>
            <label>E-mail</label><br>
            <input type="text" id="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required><br>
            <label>NIC</label><br>
            <input type="text" name="nic"><br>
            <label>Address</label><br>
            <input type="text" name="address"><br>
            
            <label>Registration Date(Today)</label><br>
            <input type="date" id="date" name="regdate"><br>
                <script>
                  const currentDate = new Date().toISOString().split('T')[0];
                  document.getElementById('date').value = currentDate;
                </script>
                <br>
                
            <fieldset required>
                <legend>Select your vehicle type:</legend>
                <select name="v1" required>
                    <option value="">Select</option>
                    <option value="car">Car</option>
                    <option value="motorcycle">Motorcycle</option>
                    <option value="threewheeler">Three Wheeler</option>
                    <option value="van">Van</option>
                    <option value="other">Other</option>
                </select>
                <br>
                <label for="plateNumber">Enter your vehicle plate number:</label>
                <input type="text" id="p1" name="p1" required>
            </fieldset>
            <fieldset>
                <legend>Optional vehicle:</legend>
                <select name="v2">
                    <option value="">Select</option>
                    <option value="car">Car</option>
                    <option value="motorcycle">Motorcycle</option>
                    <option value="threewheeler">Three Wheeler</option>
                    <option value="van">Van</option>
                    <option value="other">Other</option>
                </select>
                <br>
                <label for="plateNumber2">Enter your vehicle plate number:</label>
                <input type="text" id="p2" name="p2">
            </fieldset><br>
            
            <label>Contact Number</label><br>
            <input type="text" name="number" required><br>
            <div class="buttonc">
                <input type="reset" value="Clear">
                <input type="Submit" value="Next">
            </div>
        </form>
        </div>
       
    </body>
</html>
