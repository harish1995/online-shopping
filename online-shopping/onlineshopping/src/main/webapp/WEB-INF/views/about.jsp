<div class="container">
	<div class="row">
		<!-- would be display sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>

		</div>

		<!-- to show the actual products -->
		<div class="col-md-9">

			<!-- added breadcrumb component -->
			<div class="row">
				<div class="col-lg-12">

					
					<c:if test="${userClickAbout == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/about">Home&nbsp;</a></li>
							<li class="active">| About Us |</li>
						</ol>
					</c:if>
					
					
					<c:if test="${userClickCategoryProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home&nbsp;</a></li>
							<li class="active">| Category |</li>
							<li class="active">&nbsp;${category.name}</li>
						</ol>
					</c:if>

				</div>
			</div>
		</div>
	</div>
</div>