<%@ page language="java" pageEncoding="UTF-8"%>
<script language="javascript">
	function doNavigate(inPageId) {
		$("input[name='pageIndex']").val(inPageId);
        document.forms[0].submit();
    }
</script>
<input type="hidden" name="pageIndex" value="${page.navigateFirstPage}">
<input type="hidden" name="pageSize" value="${page.pageSize}">
<table border="0" width="530" cellspacing="0" cellpadding="0" align="right" height="25" width="100%">
  <tr>
        <td width="66%" align="right" valign="bottom"><font size="2">当前 ${page.pageNum }页/共${page.pages }页;总 ${page.total } 条记录</font>
            <a style="cursor: pointer;"  onclick="javascript:doNavigate(${1})">第一页</a>
            <c:if test="${page.hasPreviousPage }">
                <a style="cursor: pointer;" onclick="javascript:doNavigate(${page.pageNum-1})">上一页</a>
            </c:if>
            <c:if test="${page.hasNextPage }">
                <a style="cursor: pointer;" onclick="javascript:doNavigate(${page.pageNum+1})" >下一页</a>
            </c:if>
            <a style="cursor: pointer;" onclick="javascript:doNavigate(${page.pages})" >尾页</a>
       </td>
  </tr>
</table>