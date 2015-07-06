<%@ page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:forEach var="media" items="${response.data}" >
    <div align="center">
        <blockquote style=" background:#FFF; border:0; border-radius:3px; box-shadow:0 0 1px 0 rgba(0,0,0,0.5),0 1px 10px 0 rgba(0,0,0,0.15); margin: 1px; max-width:658px; padding:0; width:99.375%;">
            <div style="padding:8px;">
                <div style=" background:#F8F8F8; line-height:0; text-align:center; width:100%;">
                    <div style=" background:url('${media.images.standard_resolution.url}'); display:block; height:640px;  position:relative;  width:640px;" />
                </div>
                <p style=" margin:8px 0 0 0; padding:0 4px;">
                    <a href="#"
                        style=" color:#000; font-family:Arial,sans-serif; font-size:14px; font-style:normal; font-weight:normal; line-height:17px; text-decoration:none; word-wrap:break-word;"
                        target="_top">${media.caption.text}</a>
                </p>
                <p style=" color:#c9c8cd; font-family:Arial,sans-serif; font-size:14px; line-height:17px; margin-bottom:0; margin-top:8px; overflow:hidden; padding:8px 0 7px; text-align:center; text-overflow:ellipsis; white-space:nowrap;">
                    Фото опубликовано @${media.caption.from.username} <fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${media.caption.createdDate}"/>
                </p>
            </div>
        </blockquote>
    </div>
</c:forEach>
