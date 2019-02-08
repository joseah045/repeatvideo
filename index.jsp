<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>link</title>
    </head>
    <body align="center" style="background-color: #D8D8D8">
        <div class="container">
            <br>
            <h1>Link youtube</h1>
            <form action="Nuevo">
                <br>
                <div class="form-group row" >
                    <label for="exampleInputPassword1" class="col-sm-2">Link</label> 
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="exampleInputPassword1" name="link" placeholder="link de youtube" >
                    </div>
                    <div class="col-sm-4">
                        <button type="submit" class="btn btn-primary" >Submit</button> 
                    </div>
                    <div class="dropdown col-sm-4" >
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            repetir (veces)
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a class="dropdown-item" href="#">2</a>
                            <a class="dropdown-item" href="#">5</a>
                            <a class="dropdown-item" href="#">10</a>
                            <a class="dropdown-item" href="#">Infinito</a>
                        </div>
                    </div>
                    <br>
                </div>
                <br><br>
                
                <div class="modal-body">
                    <h4>Youtube</h4>
                    <c:forEach items="${urlrepetir}" var="resultado">
            <tr>
                
                
                <iframe src="${urlrepetir}" allowfullscreen="" frameborder="1" height="480" width="854" autoplay="1"></iframe>
            </tr>
        </c:forEach>
                    
                                
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>

