<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>
	<table class="table table-striped">
		<caption>The following section of articles are available</caption>
		<thead>
			<th>Description</th>
			<th>Category</th>
			<th>Actions</th>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.name}</td>
					<td>${todo.category}</td>
					<td>&nbsp;&nbsp;<a class="btn btn-danger"
						href="/delete-todo.do?todo=${todo.name}&category=${todo.category}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
<div>
	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<a class="btn btn-success" href="/add-todo.do">Add New Sport</a>
</div>
<div class="row">
    <div class="col-md-4">
        <div class="thumbnail">
            <a href="#">
                <img src="http://s.ndtvimg.com/images/stories/car300450.jpg?output-quality=80&output-format=jpg" class="img-responsive" />
            </a>
            <div class="caption text-center">
                <h4>Tennis</h4>
                <p>
                    100 articles
                </p>
                <a class="btn btn-sm btn-success" href="/ViewArticleServlet.do?name=tennis">read now!</a>
            </div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="thumbnail">
            <a href="#">
                <img src="https://s-media-cache-ak0.pinimg.com/736x/9c/b0/e4/9cb0e4a5361a9fef6cedf52d5da5cd7a.jpg" class="img-responsive" />
            </a>
            <div class="caption text-center">
                <h4>Rugby</h4>
                <p>
                    147 articles
                </p>
                <a class="btn btn-sm btn-success" href="/ViewArticleServlet.do?name=rugby" >read now!</a>
            </div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="thumbnail">
            <a href="#">
                <img src="http://s.ndtvimg.com/images/stories/misbah_defense300450.jpg?output-quality=80&output-format=jpg" class="img-responsive" />
            </a>
            <div class="caption text-center">
                <h4>Cricket</h4>
                <p>
                    124 articles
                </p>
                <a class="btn btn-sm btn-success" href="/ViewArticleServlet.do?name=cricket">read now!</a>
            </div>
        </div>
    </div>
</div>

